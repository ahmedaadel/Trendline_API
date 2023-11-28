package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name ="username" )
    private String userName;

    @Column(name ="password" )
    private String password ;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    Admin(){};
    @Override
    public String toString() {
        return "admin{" +
                "username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
