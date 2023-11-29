package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "phone_size")
public class PhoneSize {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "phone_id")
    private int phoneId;


    @Column(name = "size_id")
    private int sizeId;


    PhoneSize(){}
    public PhoneSize(int id, int phoneId, int sizeId) {
        this.id = id;
        this.phoneId = phoneId;
        this.sizeId = sizeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public String toString() {
        return "phone_size{" +
                "id=" + id +
                ", phoneId=" + phoneId +
                ", sizeId=" + sizeId +
                '}';
    }
}


