package com.kardan.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "kardanapp", name="shops")
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column(name="shop_name")
    private String shopName;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "shop")
    List<Unit> units;
}