package com.Trendline.Trendline.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "colorCode")
    private String colorCode ;

    public Color(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "color{" +
                "id=" + id +
                ", colorCode='" + colorCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
