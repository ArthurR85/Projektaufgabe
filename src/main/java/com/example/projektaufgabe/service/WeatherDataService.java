package com.example.projektaufgabe.service;

import com.example.projektaufgabe.model.WeatherData;
import com.example.projektaufgabe.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherDataService {

    @Autowired
    private WeatherDataRepository weatherDataRepository;

    public WeatherData saveWeatherData(WeatherData weatherData) {
        return weatherDataRepository.save(weatherData);
    }
}
