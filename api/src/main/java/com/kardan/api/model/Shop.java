package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name="name")
    private String shopName;

    @JsonIgnore
    @Column(name="password")
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "shop")
    List<Unit> units;
}