package com.example.projektaufgabe.controller;

import com.example.projektaufgabe.model.WeatherData;
import com.example.projektaufgabe.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/all")
    public List<WeatherData> getAllWeatherData() {
        return weatherDataService.getAllWeatherData();
    }
}
