package citi.com.weatherapi.service;

import citi.com.weatherapi.dto.CityWeatherDTO;
import citi.com.weatherapi.entity.City;
import citi.com.weatherapi.entity.ConsolidatedWeather;
import citi.com.weatherapi.entity.Woeid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityWeatherService {

    public ResponseEntity<?> getWoeid(String cityName) {
        RestTemplate restTemplate = new RestTemplate();
        String base_url = "https://www.metaweather.com/api/location/search/?query=";
        City[] city =
                restTemplate.getForObject(base_url + cityName, City[].class);

        Integer searchByWoeid = city[0].getWoeid();
        System.out.println(searchByWoeid);

        restTemplate = new RestTemplate();

        base_url = "https://www.metaweather.com/api/location/";
        Woeid response =
                restTemplate.getForObject(base_url + searchByWoeid, Woeid.class);
        List<ConsolidatedWeather> consolidatedWeathers = response.getConsolidatedWeathers();
        System.out.println(consolidatedWeathers);

        ConsolidatedWeather recentWeather = consolidatedWeathers.get(consolidatedWeathers.size() -1);
        CityWeatherDTO weatherDTO = new CityWeatherDTO();

        List<CityWeatherDTO> weatherDTOList = new ArrayList<>();
        weatherDTO.setCityName(cityName);
        weatherDTO.setCelciusTemp(recentWeather.getThe_temp());
        weatherDTO.setFahrTemp((weatherDTO.getCelciusTemp() * (9/5)) + 32);
        weatherDTOList.add(weatherDTO);

        System.out.println(weatherDTOList);
        return ResponseEntity.ok().body(weatherDTOList);
    }
}
