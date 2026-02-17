package subject;

import java.util.ArrayList;

import observer.Observer;

public class WeatherData implements Subject{

    //Attributes for getters.
    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;

    //Array for observers.
    protected ArrayList<Observer> observers;

    //Constructor.
    public WeatherData(){
        observers = new ArrayList<>();
    }

    //Implementations from subject.
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    //Class methods.

    //Getters.
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public float getHeatIndex(){
        return heatIndex;
    }
    
    //Measurements update
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
