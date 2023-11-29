package com.Trendline.Trendline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class Size {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "size")
    private String size ;

    Size(){}
    public Size(String size) {
        this.size = size;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size{" +
                "id=" + id +
                ", size='" + size + '\'' +
                '}';
    }
}
