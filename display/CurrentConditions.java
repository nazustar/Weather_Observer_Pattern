package display;

import observer.DisplayElement;
import observer.Observer;
import subject.Subject;

public class CurrentConditions implements DisplayElement, Observer {

    //Attributes for display.
    private float temperature;
    private float humidity;
    private float pressure;

    //Constructor that registers the observer to the subject for display.
    public CurrentConditions(Subject weatherData){
        weatherData.registerObserver(this);
    }

    //Implementation of the method from Observer.
    @Override
    public void update(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        display();
    }
    //Implementation of the method from DisplayElement.
    @Override
    public void display (){
        System.out.println("Current Condition Display");
        System.out.println("-----------------------");
        System.out.println("The temperature is: " + temperature);
        System.out.println("The humidity is: " + humidity);
        System.out.println("The pressure is: " + pressure);
        System.out.println("-----------------------");
    }
}
