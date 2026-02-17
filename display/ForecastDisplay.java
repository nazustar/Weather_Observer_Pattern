package display;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class ForecastDisplay implements DisplayElement, Observer{

    //Constructor that registers the observer to the subject for display.
    public ForecastDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p){}

    @Override
    public void display(){}
}