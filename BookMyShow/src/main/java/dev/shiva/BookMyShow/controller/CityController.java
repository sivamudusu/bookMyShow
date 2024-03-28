package dev.shiva.BookMyShow.controller;

import dev.shiva.BookMyShow.dto.CityDto;
import dev.shiva.BookMyShow.model.City;
import dev.shiva.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired

    private CityService cityService;


    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityDto cityDto){
        try{
            String cityName = cityDto.getName();
            if(cityName == null || cityName.length()==0 || cityName.isBlank()){
                throw new Exception("city name not found");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);

        }catch (Exception e){
            e.printStackTrace();
            return null;

        }

    }


    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int id){
        boolean deleted = cityService.deleteCity(id);
        return ResponseEntity.ok(deleted);
    }
}
