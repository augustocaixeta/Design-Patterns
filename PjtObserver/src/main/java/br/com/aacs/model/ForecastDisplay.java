package br.com.aacs.model;

import br.com.aacs.interfaces.DisplayElement;
import br.com.aacs.interfaces.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float curPressure = 29.9f;
    private float lastPressure;
    private WeatherData wd;
    
    public ForecastDisplay(WeatherData wd) {
        this.wd = wd;
        wd.registrerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = curPressure;
        curPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast:");
        if (curPressure > lastPressure) {
            System.out.println("Improving weather on the way.");
        } else if (curPressure == lastPressure) {
            System.out.println("More of the same.");
        } else if (curPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather.");
        }
    }
}
