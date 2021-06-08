package com.beratyesbek.hrms.entities.concretes;

import javax.persistence.Column;

public class User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "identityNumber")
    private String identityNumber;

    public User(String firstName, String lastName, String email, String dateOfBirth, String identityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
    }
    public User(){}
}
