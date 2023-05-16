package com.kardan.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "kardanapp", name="categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    @JsonIgnore
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.REMOVE, orphanRemoval = true)

    private List<Category> children = new ArrayList<Category>();

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Part> partsCategory;
}



