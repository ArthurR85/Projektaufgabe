package com.example.projektaufgabe.service.impl;

import com.example.projektaufgabe.model.WeatherData;
import com.example.projektaufgabe.repository.WeatherDataRepository;
import com.example.projektaufgabe.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private WeatherDataRepository weatherDataRepository;

    @Override
    public WeatherData saveWeatherData(WeatherData weatherData) {
        // Hier könnten Validierungen oder Geschäftslogik vor dem Speichern durchgeführt werden
        return weatherDataRepository.save(weatherData);
    }

    @Override
    public List<WeatherData> getAllWeatherData() {
        return weatherDataRepository.findAll();
    }
}
