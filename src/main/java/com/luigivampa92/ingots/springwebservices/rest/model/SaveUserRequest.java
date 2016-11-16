package com.luigivampa92.ingots.springwebservices.rest.model;

import com.luigivampa92.ingots.springwebservices.data.model.UserModel;

import java.util.Date;

public class SaveUserRequest {

    private String externalId;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;

    public UserModel toModel() {
        UserModel model = new UserModel();
        model.setExternalId(externalId);
        model.setFirstName(firstName);
        model.setLastName(lastName);
        model.setBirthday(birthday);
        model.setEmail(email);
        return model;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
