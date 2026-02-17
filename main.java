import display.CurrentConditions;
import display.HeatIndexDisplay;
import display.PressureDisplay;
import subject.WeatherData;

public class main {
public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        new CurrentConditions(weatherData);
        new HeatIndexDisplay(weatherData);
        new PressureDisplay(weatherData);

    }
}