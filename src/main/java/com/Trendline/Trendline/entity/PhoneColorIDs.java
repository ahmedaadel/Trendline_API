package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "phone_color")
public class PhoneColorIDs {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "phone_id")
    private int phoneId;


    @Column(name = "color_id")
    private int colorId;


    PhoneColorIDs(){}
    public PhoneColorIDs(int id, int phoneId, int colorId) {
        this.id = id;
        this.phoneId = phoneId;
        this.colorId = colorId;
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

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int sizeId) {
        this.colorId = sizeId;
    }

    @Override
    public String toString() {
        return "phone_size{" +
                "id=" + id +
                ", phoneId=" + phoneId +
                ", sizeId=" + colorId +
                '}';
    }
}


