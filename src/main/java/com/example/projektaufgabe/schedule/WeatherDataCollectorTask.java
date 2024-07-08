package com.example.projektaufgabe.schedule;

import com.example.projektaufgabe.model.WeatherData;
import com.example.projektaufgabe.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class WeatherDataCollectorTask {

    @Autowired
    private WeatherDataService weatherDataService;

    @Scheduled(fixedRate = 60000) // Alle 60 Sekunden (eine Minute)
    public void collectWeatherData() {
        WeatherData weatherData = new WeatherData();
        weatherData.setCity("Sample City");
        weatherData.setTemperature(25.0);
        weatherData.setHumidity(60.0);
        weatherData.setWindSpeed(10.0);
        weatherData.setTimestamp(LocalDateTime.now());
        weatherDataService.saveWeatherData(weatherData);
    }
}
