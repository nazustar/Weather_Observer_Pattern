import display.CurrentConditions;
import display.ForecastDisplay;
import display.HeatIndexDisplay;
import display.PressureDisplay;
import display.StatisticsDisplay;
import subject.WeatherData;

public class main {
public static void main(String[] args) {
    
    WeatherData weatherData = new WeatherData();

    new CurrentConditions(weatherData);
    new HeatIndexDisplay(weatherData);
    new PressureDisplay(weatherData);
    new ForecastDisplay(weatherData);
    new StatisticsDisplay(weatherData);

    System.out.println("First measurements:");
    System.out.println("-----------------------");
    weatherData.setMeasurements(15, 78, 1024);
    System.out.println("Second measurements:");
    System.out.println("-----------------------");
    weatherData.setMeasurements(25,64, 1001);
    System.out.println("End");
    }
}