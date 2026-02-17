package display;

import observer.Observer;
import observer.DisplayElement;
import subject.Subject;

public class PressureDisplay implements DisplayElement, Observer {

    //Atribute.
    private float pressure;

    //Constructor that registers the observer to the subject for display.
    public PressureDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    //Implementation of the method from Observer.
    @Override
    public void update(float t, float h, float p){
        this.pressure = p;
        display();
    }

    //Implementation of the method from DisplayElement.
    @Override
    public void display(){
        System.out.println("Pressure Display");
        System.out.println("-----------------------");
        System.out.println("The pressure is: " + pressure);
        System.out.println("-----------------------");
    }
    


}
