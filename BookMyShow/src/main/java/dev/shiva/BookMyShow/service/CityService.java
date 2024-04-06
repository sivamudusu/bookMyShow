package dev.shiva.BookMyShow.service;

import dev.shiva.BookMyShow.model.City;
import dev.shiva.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String name){
        City city = new City();
        city.setName(name);
        return cityRepository.save(city);
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
    public City getCityByName(String name){
        return cityRepository.findByName(name);
    }
    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get();
    }

    public boolean deleteCity(int id){
        cityRepository.deleteById(id);
        return true;
    }
}
