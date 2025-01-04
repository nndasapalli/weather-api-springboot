package com.weather_api.entity;

import java.io.Serializable;

public class Weather implements Serializable {

	private String description;
	private String dateTime;
	private String address;
	private double humidity;
	private double pressure;
	private String sunrise;
	private String sunset;
	private double temp;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(String description, String dateTime, String address, double humidity, double pressure,
			String sunrise, String sunset, double temp) {
		this.description = description;
		this.dateTime = dateTime;
		this.address = address;
		this.humidity = humidity;
		this.pressure = pressure;
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Weather [description=" + description + ", dateTime=" + dateTime + ", address=" + address + ", humidity="
				+ humidity + ", pressure=" + pressure + ", sunrise=" + sunrise + ", sunset=" + sunset + ", temp=" + temp
				+ "]";
	}

}
