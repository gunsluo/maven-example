package com.jerrylou.maven;

/**
 * Created by jerrylou on 3/2/17.
 */
public class Test {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
