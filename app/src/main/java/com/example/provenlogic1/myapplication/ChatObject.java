package com.example.provenlogic1.myapplication;


public class ChatObject {

    String message;

    public String getType() {
        return type;
    }

    String type;

    public ChatObject(String message,String type) {
        this.message = message;
        this.type   = type;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }


}
