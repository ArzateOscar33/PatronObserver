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
public class PatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =new CurrentConditionsDisplay(weatherData);
//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
weatherData.setMeasurements(80, 65, 30.4f);
weatherData.setMeasurements(82, 70, 29.2f);
weatherData.setMeasurements(78, 90, 29.2f);
    }//main
    
}
