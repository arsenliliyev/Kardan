package com.kardan.api.dto;

import com.kardan.api.model.Category;
import com.kardan.api.model.Engine;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class EngineCategoryDTO {

    public List<EngineDTO> engines;
    public List<CategoryDTO> categories;
}