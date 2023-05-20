package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(schema = "kardanapp", name ="engines")
@Data
public class Engine extends CommonEntity{
//    @Id
//    @GeneratedValue(strategy  = GenerationType.IDENTITY)
//    private int id;

    @Column(name="value")
    private Double size;


    @ManyToOne
    @JoinColumn(name="gen_id", referencedColumnName = "id")
    private Gen gen;

    @OneToMany(mappedBy = "engine")
    @JsonIgnore
    private List<Part> parts;
}
