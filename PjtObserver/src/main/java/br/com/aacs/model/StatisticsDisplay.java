package br.com.aacs.model;

import br.com.aacs.interfaces.DisplayElement;
import br.com.aacs.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200.0f;
    private float sumTemperature = 0.0f;
    private int numReadings;
    private WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registrerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemperature += temperature;
        numReadings++;
        
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        
        display();
    }

    @Override
    public void display() {
        System.out.println("AVG / MAX / MIN - Temperature: " + (sumTemperature / numReadings) + " / " + maxTemperature + " / " + minTemperature);
    }
}
