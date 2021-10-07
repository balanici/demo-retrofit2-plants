package com.example.demoretrofit2plants.service;

import com.example.demoretrofit2plants.dao.IPlantDao;
import com.example.demoretrofit2plants.dto.Plant;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PlantService implements IPlantService {

    private final IPlantDao iPlantDao;

    public PlantService(IPlantDao iPlantDao) {
        this.iPlantDao = iPlantDao;
    }

    @Override
    public List<Plant> fetchPlants(String searchTerm) throws IOException {
        return iPlantDao.fetchPlants(searchTerm);
    }
}
