package com.example.listcustomer;

import java.util.Date;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String imagePath;
    public Customer(){
    }

    public Customer(String name, String birthday, String address, String imagePath) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
