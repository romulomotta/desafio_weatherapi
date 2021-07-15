package citi.com.weatherapi.controller;

import citi.com.weatherapi.service.CityWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class CityWeatherController {

    @Autowired
    CityWeatherService service;

    @RequestMapping(value = "/city/{cityName}", method = RequestMethod.GET)
    public ResponseEntity<?> getByCity(@PathVariable String cityName) {

        return service.getWoeid(cityName);
    }
}