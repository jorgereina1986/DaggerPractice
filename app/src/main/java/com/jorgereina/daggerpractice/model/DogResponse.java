package com.jorgereina.daggerpractice.model;

import com.google.gson.annotations.SerializedName;

public class DogResponse {

    @SerializedName("status")
    private String status;
    @SerializedName("message")
    private Message message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
