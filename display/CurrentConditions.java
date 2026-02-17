package display;

import observer.DisplayElement;
import observer.Observer;

public class CurrentConditions implements DisplayElement, Observer {

    //Attributes for display.
    private float temperature;
    private float humidity;
    private float pressure;

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
        System.out.println("Current Conditions:");
        System.out.println("The temperature is: " + temperature);
        System.out.println("The humidity is: " + humidity);
        System.out.println("The pressure is: " + pressure);
    }
}
