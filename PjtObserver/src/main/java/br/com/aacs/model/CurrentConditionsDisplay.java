package br.com.aacs.model;

import br.com.aacs.interfaces.DisplayElement;
import br.com.aacs.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    WeatherData weatherData;
    
    public CurrentConditionsDisplay(WeatherData wd) {
        this.weatherData = wd;
        wd.registrerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
