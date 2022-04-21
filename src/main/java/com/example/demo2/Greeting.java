package com.example.demo2;


public class Greeting {

    private String name;
    private String message;
    private String job;

    public Greeting() {
    }

    public Greeting(String name, String job) {
        this.name = name;
        this.message = "hello " + name;
        this.job = job;
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

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

