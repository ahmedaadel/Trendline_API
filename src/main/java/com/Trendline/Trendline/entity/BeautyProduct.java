package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "beauty_product")
public class BeautyProduct {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name ;

    @Column(name = "type")
    private String type ;


    @Column(name = "brand")
    private String brand ;

    @Column(name = "description")
    private String description ;

    @Column(name = "price")
    private double price ;

    @Column(name = "offeredPrice")
    private double offeredPrice ;

    @Column(name = "isAvailable")
    private boolean isAvailable ;

    @Column(name = "image")
    private byte[] image ;


    @Override
    public String toString() {
        return "beauty_product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", offeredPrice=" + offeredPrice +
                ", isAvailable=" + isAvailable +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public BeautyProduct(String name, String type, String brand, String description, double price, double offeredPrice, boolean isAvailable, byte[] image) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.offeredPrice = offeredPrice;
        this.isAvailable = isAvailable;
        this.image = image;
    }
}
