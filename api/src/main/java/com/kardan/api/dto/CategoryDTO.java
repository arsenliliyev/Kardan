package com.kardan.api.dto;

import com.kardan.api.model.Category;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CategoryDTO {

    private String name;

    private Category parent;

    private List<Category> children = new ArrayList<Category>();
}
