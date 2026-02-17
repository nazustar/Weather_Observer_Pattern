package subject;

public class WeatherData implements Subject{
    //Attributes fot getters.
    protected float temperature;
    protected float humidity;
    protected float pressure;
    protected float heatIndex;


    //Implementations from subject.

    public void registerObserver() {
    }

    public void removeObserver(){
    }

    public void notifyObservers(){
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
    public void MeasurementsChanged(){}


}
