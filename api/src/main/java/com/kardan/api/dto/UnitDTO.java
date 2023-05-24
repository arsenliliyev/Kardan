package com.kardan.api.dto;

import com.kardan.api.model.Manufacturer;
import com.kardan.api.model.Part;
import com.kardan.api.model.Shop;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UnitDTO {

    private Part part;

    private Shop shop;

    private double price;

    private Manufacturer manufacturer;
}
