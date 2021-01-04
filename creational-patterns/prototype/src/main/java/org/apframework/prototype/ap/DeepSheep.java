package org.apframework.prototype.ap;

import java.util.Date;

public class DeepSheep implements Cloneable {

    public DeepSheep(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public DeepSheep() {
    }

    private String name;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "DeepSheep{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepSheep deepSheep = (DeepSheep) super.clone();
        deepSheep.birthDay = (Date) this.birthDay.clone();
        return deepSheep;
    }
}
