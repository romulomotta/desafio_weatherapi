package citi.com.weatherapi.service;

import citi.com.weatherapi.entity.City;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CityWeatherServiceTest {

    @Test
    public void testWoeidByCity() {
        CityWeatherService service = new CityWeatherService();

        RestTemplate restTemplate = new RestTemplate();
        String base_url = "https://www.metaweather.com/api/location/search/?query=";
        String cityName = "Paris";
        City[] city =
                restTemplate.getForObject(base_url + cityName, City[].class);
        service.getWoeid(cityName);

        assertTrue(city[0].getWoeid().equals(615702));
    }
}

