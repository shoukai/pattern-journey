package org.apframework.nio.xuwang;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.*;

@Slf4j
public class ServerOnFutureForMultiClients {
    static final int DEFAULT_PORT = 7777;
    static final String IP = "127.0.0.1";
    static ExecutorService taskExecutorService = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
    static ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

    public static void main(String[] args) {
        try (AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open()) {
            if (serverSocketChannel.isOpen()) {
                serverSocketChannel.setOption(StandardSocketOptions.SO_REUSEADDR, true);
                serverSocketChannel.bind(new InetSocketAddress(IP, DEFAULT_PORT));
                log.info("Waiting for connections...");
                while (true) {
                    Future<AsynchronousSocketChannel> socketChannelFuture = serverSocketChannel.accept();
                    try {
                        final AsynchronousSocketChannel socketChannel = socketChannelFuture.get();
                        Callable<String> worker = () -> {
                            String s = socketChannel.getRemoteAddress().toString();
                            log.info("Incoming connection from : " + s);
                            while (socketChannel.read(buffer).get() != -1) {
                                buffer.flip();
                                ByteBuffer duplicate = buffer.duplicate();
                                showMessage(duplicate);
                                socketChannel.write(buffer).get();
                                if (buffer.hasRemaining()) {
                                    buffer.compact();
                                } else {
                                    buffer.clear();
                                }
                            }
                            socketChannel.close();
                            log.info(s + " was successfully served!");
                            return s;
                        };
                        taskExecutorService.submit(worker);
                    } catch (InterruptedException | ExecutionException e) {
                        log.error("", e);
                        taskExecutorService.shutdown();
                        while (!taskExecutorService.isTerminated()) {
                        }
                        break;
                    }
                }
            } else {
                log.warn("The asynchronous server-socket channel cannot be opened!");
            }
        } catch (IOException e) {
            log.error("", e);
        }
    }

    protected static void showMessage(ByteBuffer buffer) {
        CharBuffer decode = Charset.defaultCharset().decode(buffer);
        log.info(decode.toString());
    }
}