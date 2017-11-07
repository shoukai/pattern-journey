package org.apframework.nio.yyf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * http://blog.csdn.net/qq_18860653/article/details/53406723
 */
public class CopyFile {
    static public void main(String args[]) throws Exception {

        String infile = "nio-yyf-input.txt";
        String outfile = "nio-yyf-output.txt";

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        FileInputStream fileInputStream = new FileInputStream(
                new File(classLoader.getResource(infile).getFile())
        );
        FileOutputStream fileOutputStream = new FileOutputStream(
                new File(classLoader.getResource(outfile).getFile())
        );
        // 获取读的通道
        FileChannel inputStreamChannel = fileInputStream.getChannel();
        // 获取写的通道
        FileChannel outputStreamChannel = fileOutputStream.getChannel();
        // 定义缓冲区，并指定大小
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            // 清空缓冲区
            buffer.clear();
            //从通道读取一个数据到缓冲区
            int r = inputStreamChannel.read(buffer);
            //判断是否有从通道读到数据
            if (r == -1) {
                break;
            }
            //将buffer指针指向头部
            buffer.flip();
            //把缓冲区数据写入通道
            outputStreamChannel.write(buffer);
        }
    }
}

