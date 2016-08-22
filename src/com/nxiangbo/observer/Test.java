package com.nxiangbo.observer;

public class Test {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentCoditionsDisplay currentDisplay = new CurrentCoditionsDisplay(weatherData);
		StatisticsConditionsDisplay statisticsDisplay = new StatisticsConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 43.4f);
		weatherData.setMeasurements(82, 65, 43.4f);
	}
}
