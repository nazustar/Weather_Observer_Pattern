import display.CurrentConditions;
import display.ForecastDisplay;
import display.HeatIndexDisplay;
import display.PressureDisplay;
import display.StadisticsDisplay;
import subject.WeatherData;

public class main {
public static void main(String[] args) {
    
    WeatherData weatherData = new WeatherData();

    new CurrentConditions(weatherData);
    new HeatIndexDisplay(weatherData);
    new PressureDisplay(weatherData);
    new ForecastDisplay(weatherData);
    new StadisticsDisplay(weatherData);

    weatherData.setMeasurements(15, 78, 1024);
    weatherData.setMeasurements(25,64, 1001);
    }
}