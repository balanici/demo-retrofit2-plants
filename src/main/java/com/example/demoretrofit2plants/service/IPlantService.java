package com.example.demoretrofit2plants.service;

import com.example.demoretrofit2plants.dto.Plant;

import java.io.IOException;
import java.util.List;

public interface IPlantService {

    List<Plant> fetchPlants(String searchTerm) throws IOException;

}
