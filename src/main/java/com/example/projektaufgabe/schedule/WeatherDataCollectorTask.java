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

    // Scheduled task to run every 5 minutes
    @Scheduled(fixedRate = 300000) // 5 minutes = 300,000 milliseconds
    public void collectWeatherData() {
        // Implement logic to fetch weather data from OpenWeatherMap API and save it
        WeatherData weatherData = new WeatherData();
        weatherData.setCity("Wangen im Allgäu");
        // Set temperature, humidity, wind speed, timestamp accordingly

        // Save weather data
        weatherDataService.saveWeatherData(weatherData);

        System.out.println("Weather data collected and saved: " + LocalDateTime.now());
    }
}
