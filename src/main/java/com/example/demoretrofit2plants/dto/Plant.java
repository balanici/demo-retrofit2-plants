package com.example.demoretrofit2plants.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Plant {

    @SerializedName("id")
    
    private Integer id;
    @SerializedName("genus")
    
    private String genus;
    @SerializedName("species")
    
    private String species;
    @SerializedName("cultivar")
    
    private String cultivar;
    @SerializedName("common")
    
    private String common;
    @SerializedName("wetSoil")
    
    private Boolean wetSoil;
    @SerializedName("drySoil")
    
    private Boolean drySoil;
    @SerializedName("rainGarden")
    
    private Boolean rainGarden;
    @SerializedName("fullSun")
    
    private Integer fullSun;
    @SerializedName("partShade")
    
    private Integer partShade;
    @SerializedName("deepShade")
    
    private Integer deepShade;

}
