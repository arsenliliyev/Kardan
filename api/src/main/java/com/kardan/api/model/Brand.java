package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "kardanapp", name="brands")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String brandName;

   // private LocalDateTime created_date;

  //  private Integer state;

  @JsonIgnore
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<Model> models;
}