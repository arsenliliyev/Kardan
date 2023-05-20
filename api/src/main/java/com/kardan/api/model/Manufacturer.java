package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "kardanapp", name="manufacturers")
@Data
public class Manufacturer extends CommonEntity{
//    @Id
//    @GeneratedValue(strategy  = GenerationType.IDENTITY)
//    private int id;

    @Column(name="name")
    private String manufacturerName;

    @JsonIgnore
    @OneToMany(mappedBy="manufacturer")
    private List<Unit> partsManufacturer;
}