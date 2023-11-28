package com.Trendline.Trendline.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clothes_color_size")
public class ClothesColorSize {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "clothesId")
    private int clothesId;

    @Column(name = "sizeId")
    private int sizeId;

    @Column(name = "colorId")
    private int colorId;

    public ClothesColorSize(int clothesId, int sizeId, int colorId) {
        this.clothesId = clothesId;
        this.sizeId = sizeId;
        this.colorId = colorId;
    }

    @Override
    public String toString() {
        return "clothes_color_size{" +
                "id=" + id +
                ", clothesId=" + clothesId +
                ", sizeId=" + sizeId +
                ", colorId=" + colorId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClothesId() {
        return clothesId;
    }

    public void setClothesId(int clothesId) {
        this.clothesId = clothesId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
}
