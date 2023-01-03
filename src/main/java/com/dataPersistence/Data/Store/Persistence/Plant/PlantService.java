package com.dataPersistence.Data.Store.Persistence.Plant;

import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}
