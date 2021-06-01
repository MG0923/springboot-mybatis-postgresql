package com.mybatis.model;


public class Accounts {
    int id;
    String userName;
    String email;
    String createdOn;

    public Accounts() {
    }

    public Accounts(int id, String userName, String email, String createdOn) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.createdOn = createdOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", createdOn='" + createdOn + '\'' +
                '}';
    }
}
