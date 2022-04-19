package com.example.demo2;


public class Greeting {

    private String name;
    private String message;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
        this.message = "hello " + name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
