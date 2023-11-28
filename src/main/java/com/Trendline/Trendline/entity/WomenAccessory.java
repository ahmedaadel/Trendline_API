package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "women_accessory")
public class WomenAccessory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type")
    private String type ;

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


    public WomenAccessory(String type, String description, double price, double offeredPrice, boolean isAvailable, byte[] image) {
        this.type = type;
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
        return "women_accessory{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", offeredPrice=" + offeredPrice +
                ", isAvailable=" + isAvailable +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
