package com.sherold.store.Dto;

public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String password;


    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPassword() {
        return this.password;
    }

    // Don't pass unencrypted passwords to this
    public void setPassword(String password) {
        this.password = password;
    }
}
