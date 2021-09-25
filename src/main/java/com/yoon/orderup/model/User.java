package com.yoon.orderup.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String pwd;
    private int points;
    private Role role;


    public User(){
        super();
        role = Role.CUSTOMER;
    }

    public User(Long id, String email, String name, String pwd, int points, Role role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.pwd = pwd;
        this.points = points;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    public Role getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
