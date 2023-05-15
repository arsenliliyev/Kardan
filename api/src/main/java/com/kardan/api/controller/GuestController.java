package com.kardan.api.controller;

import com.kardan.api.dto.EngineCategoryDTO;
import com.kardan.api.model.*;
import com.kardan.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kardan")
public class GuestController {

    private final BrandService brandService;
    private final ModelService modelService;
    private final GenServise genServise;
    private final EngineService engineService;
    private final CategoryService categoryService;
    private final UnitService unitService;
    private final PartService partService;


    public GuestController(BrandService brandService, ModelService modelService, GenServise genServise, EngineService engineService,
                           CategoryService categoryService, UnitService unitService, PartService partService) {
        this.brandService = brandService;
        this.modelService = modelService;
        this.genServise = genServise;
        this.engineService = engineService;
        this.categoryService = categoryService;
        this.unitService = unitService;
        this.partService = partService;
    }



    @GetMapping("/brands")
    public List<Brand> getBrands() {
        return brandService.findAll();
    }

    @GetMapping("/brands/model")
    public List<Model> getModels(@RequestParam("brandId") int id) {
        return modelService.findByBrandId(id);
    }

    @GetMapping("/brands/model/gen")
    public List<Gen> getGens(@RequestParam("modelId") int id) {
        return genServise.findByModelId(id);
    }

    @GetMapping("/brands/model/gen/engine")
    public EngineCategoryDTO getEngines(@RequestParam("genId") int id) {
        EngineCategoryDTO engineCategoryDTO=new EngineCategoryDTO();
        engineCategoryDTO.engines = engineService.findByGen(id);
        engineCategoryDTO.categories = categoryService.findSubCategories();
        return engineCategoryDTO;
    }

    @GetMapping("/test")
    public int test(@RequestParam("categoryId") int category_id, @RequestParam("engineId") int engine_id) {
        return partService.findPartid(category_id, engine_id);
    }

    @GetMapping("/units")
    public List<Unit> g(@RequestParam("partId") int partId){
        return unitService.findUnitByPartId(545);
    }

    @GetMapping("/brands/model/gen/engine/units")
    public List<Unit> getUnits(@RequestParam("categoryId") int category_id, @RequestParam("engineId") int engine_id) {
        return unitService.findUnitByPartId(partService.findPartid(category_id, engine_id));
    }
}