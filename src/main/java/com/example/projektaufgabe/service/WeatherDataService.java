package com.example.projektaufgabe.service;

import com.example.projektaufgabe.model.WeatherData;

import java.util.List;

public interface WeatherDataService {
    WeatherData saveWeatherData(WeatherData weatherData);
    List<WeatherData> getAllWeatherData();
}
