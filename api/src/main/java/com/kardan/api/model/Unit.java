package com.kardan.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "kardanapp", name="units")
@Data
public class Unit {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="part_id", referencedColumnName = "id")
    private Part part;

    @ManyToOne
    @JoinColumn(name="shop_id", referencedColumnName = "id")
    private Shop shop;

    @Column(name="price")
    private double price;

    @ManyToOne
    @JoinColumn(name="manufacturer_id", referencedColumnName = "id")
    private Manufacturer manufacturer;
}