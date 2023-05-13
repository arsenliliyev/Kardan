package com.kardan.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "kardanapp", name="manufacturers")
@Data
public class Manufacturer {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column(name="manufacturer_name")
    private String manufacturerName;

    @OneToMany(mappedBy="manufacturer")
    private List<Unit> partsManufacturer;
}