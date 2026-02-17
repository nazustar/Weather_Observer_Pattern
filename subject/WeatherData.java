package subject;

import java.util.ArrayList;

import observer.Observer;

public class WeatherData implements Subject{

    //Attributes fot getters.
    public float temperature;
    public float humidity;
    public float pressure;
    public float heatIndex;

    //Array for observers.
    protected ArrayList<Observer> observers;

    //Implementations from subject.

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(Observer o){
        o.update(temperature, humidity, pressure);
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
    public void MeasurementsChanged(Observer o){
        notifyObservers(o);
    }

}
