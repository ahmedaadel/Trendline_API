package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.Arrays;

@Entity
@Table(name = "electronic_device")
public class ElectronicDevice {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name ;

    @Column(name = "price")
    private double price ;

    @Column(name = "type")
    private String type ;

    @Column(name = "description")
    private String description ;

    @Column(name = "offered_price")
    private double offeredPrice ;

    @Column(name = "is_available")
    private int isAvailable ;

    @Column(name = "is_top_sale")
    private int isTopSale ;

    public int getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getIsTopSale() {
        return isTopSale;
    }

    public void setIsTopSale(int isTopSale) {
        this.isTopSale = isTopSale;
    }

    @Column(name = "image")
    private byte[] image ;

    ElectronicDevice(){}

    public ElectronicDevice(int id, String name, double price, String type, String description, double offeredPrice, int isAvailable, int isTopSale, byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.description = description;
        this.offeredPrice = offeredPrice;
        this.isAvailable = isAvailable;
        this.isTopSale = isTopSale;
        this.image = image;
    }

    @Override
    public String toString() {
        return "electronic_device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", offeredPrice=" + offeredPrice +
                ", isAvailable=" + isAvailable +
                ", image=" + Arrays.toString(image) +
                '}';
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    public int isAvailable() {
        return isAvailable;
    }

    public void setAvailable(int available) {
        isAvailable = available;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
