package org.apframework.prototype.ap;

import java.util.Date;

public class ShadowSheep implements Cloneable{

    public ShadowSheep() {
    }

    public ShadowSheep(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShadowSheep{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
