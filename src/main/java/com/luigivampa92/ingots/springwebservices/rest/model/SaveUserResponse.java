package com.luigivampa92.ingots.springwebservices.rest.model;

import java.math.BigInteger;

public class SaveUserResponse {

    private String response;

    public SaveUserResponse() {}

    public SaveUserResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
