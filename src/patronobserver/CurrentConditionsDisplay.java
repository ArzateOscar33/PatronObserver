/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

/**
 *
 * @author Arxate
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    
    
//Creamos los atributos de la clase 
    private float temperature;
    private float humidity;
    private WeatherData weatherData;


public CurrentConditionsDisplay(WeatherData weatherData) {
this.weatherData = weatherData;
weatherData.registerObserver(this);
}
//implementamos los metodos abstractos heredados 
@Override
public void update(float temperature, float humidity, float pressure) {
this.temperature = temperature;
this.humidity = humidity;
display();
}

@Override
public void display() {
System.out.println("Current conditions: " + temperature
+ "F degrees and " + humidity + "% humidity");
}
    
}//class
