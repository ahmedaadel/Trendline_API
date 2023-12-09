package com.Trendline.Trendline.entity;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "phone")
public class Phone {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name")
        private String name ;

        @Column(name = "brand")
        private String brand ;

        @Column(name = "description")
        private String description ;

        @Column(name = "price")
        private double price ;

        @Column(name = "offered_price")
        private double offeredPrice ;

        @Column(name = "is_available")
        private boolean isAvailable ;

        @Column(name = "image")
        private byte[] image ;

        Phone(){}
    public Phone(String name, String brand, String description, double price, double offeredPrice, boolean isAvailable, byte[] image) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.offeredPrice = offeredPrice;
        this.isAvailable = isAvailable;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", offeredPrice=" + offeredPrice +
                ", isAvailable=" + isAvailable +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
