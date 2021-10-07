package com.example.demoretrofit2plants.dao;

import com.example.demoretrofit2plants.dto.Plant;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

@Repository
public interface IPlantRetrofitDao {

    @GET("/perl/mobile/viewplantsjsonarray.pl")
    Call<List<Plant>> getPlants(@Query("Combined_Name") String combinedName);

}
