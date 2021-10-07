package com.example.demoretrofit2plants.controller;

import com.example.demoretrofit2plants.dto.Plant;
import com.example.demoretrofit2plants.service.IPlantService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    private final IPlantService plantService;

    public PlantController(IPlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping()
    public ResponseEntity<List<Plant>> getPlants(@RequestParam(name = "searchTerm") String searchTerm) {
        try {
            final List<Plant> plantList = plantService.fetchPlants(searchTerm);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            return new ResponseEntity<>(plantList, httpHeaders, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

}
