package com.fiipractic.week1.models;

public class HelloWorldModel {

    private String str;

    public HelloWorldModel(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "HelloWorldModel{" +
                "str='" + str + '\'' +
                '}';
    }
}
