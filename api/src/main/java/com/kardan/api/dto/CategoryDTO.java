package com.kardan.api.dto;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CategoryDTO {

    private String name;

  //  private Category parent;

    private List<CategoryDTO> children = new ArrayList<CategoryDTO>();
}
