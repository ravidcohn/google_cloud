package com.example.Ravid.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    public MyBean(String myData) {
        this.myData = myData;
    }

    public MyBean(){

    }

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}