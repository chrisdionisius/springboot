package com.dionisius.web;

public class HelloWorld {
    private  String hello = "world";

    public HelloWorld() {
        System.out.println(hello);
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
