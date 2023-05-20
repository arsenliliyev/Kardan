package com.kardan.api.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(schema = "kardanapp", name="gens")
@Data
public class Gen extends CommonEntity{
//    @Id
//    @GeneratedValue(strategy  = GenerationType.IDENTITY)
//    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="model_id", referencedColumnName = "id")
    @JsonIgnore
    private Model model;

    @OneToMany(mappedBy = "gen")
    @JsonIgnore
    private List<Engine> engines;
}