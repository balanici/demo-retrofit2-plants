package com.example.demoretrofit2plants.dao;

import com.example.demoretrofit2plants.dto.Plant;

import java.io.IOException;
import java.util.List;

public interface IPlantDao {

    List<Plant> fetchPlants(String combinedName) throws IOException;
}
