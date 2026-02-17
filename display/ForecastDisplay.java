package display;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class ForecastDisplay implements DisplayElement, Observer{

    //Attributes.
    private float currentPressure;
    private float lastPressure;

    //Constructor that registers the observer to the subject for display.
    public ForecastDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p){
        lastPressure = currentPressure;
        currentPressure = p;
    }

    @Override
    public void display(){

        System.out.println("Forecast Display");
        System.out.println("---------------------");

        //Here is a comparasion for last and current pressure.
        //It decides if the weather is better or not.
        if (currentPressure > lastPressure){

            System.out.println("The weather is improving!");
            System.out.println("Curent pressure: " + currentPressure);
            System.out.println("Last pressure: " + lastPressure);

        }else if (currentPressure < lastPressure){

            System.out.println("The weather is worse!");
            System.out.println("Curent pressure: " + currentPressure);
            System.out.println("Last pressure: " + lastPressure);
        }else{
            System.out.println("The weather is the same!");
        }
        System.out.println("---------------------");
    }
}