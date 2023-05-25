package com.kardan.api.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

@Entity
@Table(schema = "kardanapp", name="units")
@Data
//@Where(clause = "state=true")
public class Unit extends CommonEntity{

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