package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "phone_color")
public class PhoneColor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "phone_id")
    private int phoneId;


    @Column(name = "color_id")
    private int coloeId;


    PhoneColor(){}
    public PhoneColor(int id, int phoneId, int coloeId) {
        this.id = id;
        this.phoneId = phoneId;
        this.coloeId = coloeId;
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
        return coloeId;
    }

    public void setSizeId(int sizeId) {
        this.coloeId = sizeId;
    }

    @Override
    public String toString() {
        return "phone_size{" +
                "id=" + id +
                ", phoneId=" + phoneId +
                ", sizeId=" + coloeId +
                '}';
    }
}


