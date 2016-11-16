package com.luigivampa92.ingots.springwebservices.data.model;

import com.luigivampa92.ingots.springwebservices.rest.model.User;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "TEST_USER")
@SequenceGenerator(name = "TEST_USER_SEQ", sequenceName = "TEST_USER_SEQ")
public class UserModel {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "TEST_USER_SEQ")
    private BigInteger id;

    @Column(name = "EXTERNAL_ID")
    private String externalId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "EMAIL")
    private String email;

    public User toUser() {
        User user = new User();
        user.setId(id);

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthday(birthday);
        user.setEmail(email);
        return user;
    }

    public BigInteger getId() {
        return id;
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

