package com.kardan.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class EngineCategoryDTO {

    public List<EngineDTO> engines;
    public List<CategoryDTO> categories;
}