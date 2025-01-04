package com.weather_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather_api.entity.Weather;

@Service
public class WeatherService {
	
	@Value("${Weather.API.KEY}")
	private String API_KEY;
	
	@Cacheable(value = "weather", key = "#location", unless = "#result == null")
	public Weather getWeatherReportByLocation(String location) {
		
		String url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + location + "/?key=" + API_KEY;
		RestTemplate restTemplate = new RestTemplate();
		String data = restTemplate.getForObject(url, String.class);	
		
		Weather todayWeather = null;
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode  rootNode =  objectMapper.readTree(data);
			var days = rootNode.path("days");
			var today = days.get(0);
				
		    String todayDescription = today.get("description").asText();
		    String todayDate = today.get("datetime").asText();
		    String address = rootNode.get("address").asText();
		    double humidity = today.get("humidity").asDouble();
		    double pressure = today.get("pressure").asDouble();
		    String sunrise = today.get("sunrise").asText();
		    String sunset = today.get("sunset").asText();
		    double temperature = today.get("temp").asDouble();
				
		    todayWeather = new Weather(todayDescription, todayDate, address, humidity, pressure, sunrise, sunset, temperature);
		        
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return todayWeather;
		
	}
}
