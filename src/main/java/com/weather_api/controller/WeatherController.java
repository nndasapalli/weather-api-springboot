package com.weather_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather_api.entity.Weather;
import com.weather_api.service.WeatherService;

@RestController
@RequestMapping("/api/weather/")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/{location}")
	public ResponseEntity<Weather> getWeatherReportByLocation(@PathVariable("location") String location) {
		Weather weather = weatherService.getWeatherReportByLocation(location);
		if(weather != null) {
			return ResponseEntity.ok(weather);
		}
		return ResponseEntity.notFound().build();
	}

}
