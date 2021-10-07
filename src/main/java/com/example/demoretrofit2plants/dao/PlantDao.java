package com.example.demoretrofit2plants.dao;

import com.example.demoretrofit2plants.dto.Plant;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class PlantDao implements IPlantDao {

    @Override
    public List<Plant> fetchPlants(String combinedName) throws IOException {

        final Retrofit retrofitInstance = RetrofitInstance.getRetrofitInstance();
        final IPlantRetrofitDao iPlantRetrofitDao = retrofitInstance.create(IPlantRetrofitDao.class);
        final Call<List<Plant>> plantsCall = iPlantRetrofitDao.getPlants(combinedName);
        final Response<List<Plant>> listResponse = plantsCall.execute();
        final List<Plant> plantList = listResponse.body();

        return plantList;
    }
}
