package com.luigivampa92.ingots.springwebservices.rest.model;

import java.util.List;

public class UserListResponse {

    private List<User> response;

    public UserListResponse() {}

    public UserListResponse(List<User> response) {
        this.response = response;
    }

    public List<User> getResponse() {
        return response;
    }

    public void setResponse(List<User> response) {
        this.response = response;
    }
}
