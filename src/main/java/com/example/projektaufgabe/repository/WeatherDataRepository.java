package com.example.projektaufgabe.repository;

import com.example.projektaufgabe.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {
}
