/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arxate
 */
public class WeatherData implements Subject{
    //creamos las variables que necesitaremos
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    //creamos el constructor
    
    public WeatherData(){
        observers= new ArrayList<Observer>();
    }
//implementamos los metodos de la interface Subject
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
   }
    public void measurementsChanged() {
    notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
}
}
