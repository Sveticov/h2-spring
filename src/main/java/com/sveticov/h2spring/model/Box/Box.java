package com.sveticov.h2spring.model.Box;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "box")
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int size_h;
    private int size_l;
    private int size_w;
    private int quantity;


    public Box(String name, int size_h, int size_l, int size_w, int quantity) {
        this.name = name;
        this.size_h = size_h;
        this.size_l = size_l;
        this.size_w = size_w;
        this.quantity = quantity;
    }

    public Box() {
    }
}
