package org.apframework.adapter.ap;

public class Adapter implements Target {

    private ToBuUse toBuUse;

    public Adapter(ToBuUse toBuUse){
        this.toBuUse = toBuUse;
    }

    @Override
    public void process() {
        toBuUse.doBefore();
        toBuUse.doSomething();
        toBuUse.doAfter();
    }
}
