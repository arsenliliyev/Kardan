package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(schema = "kardanapp", name ="engines")
@Data
public class Engine {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column(name="size")
    private Double size;

    @Column(name="fuel")
    private String fuel;

    @ManyToOne
    @JoinColumn(name="gen_id", referencedColumnName = "id")
    private Gen gen;

    @OneToMany(mappedBy = "engine")
    @JsonIgnore
    private List<Part> parts;
}
