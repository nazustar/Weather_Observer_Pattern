package subject;

import observer.DisplayElement;
import observer.Observer;

public class HeatIndex implements Observer, DisplayElement{

    //Attributes.
    public double heatIndex;
    public double temperature;
    public double humidity;

    //Constants.
    private double c1 = -8.78469475556;
    private double c2 = 1.81139411;
    private double c3 = 2.33854883889;
    private double c4 = -0.14611605;
    private double c5 = -0.012308094;
    private double c6 = -0.0164248277778;
    private double c7 = 0.002211732;
    private double c8 = 0.00072546;
    private double c9 = -0.000003582;

    //Implementation of update method from Observer.
    //Here we update the temperature and humidity, and update the heat index.
    @Override
    public void update(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        heatIndex = estimateHeatIndex(t, h);
        display();
    }

    //Operations for heat index, it returns the heat index.
    public double estimateHeatIndex(double t, double h){
        heatIndex = ((c1) + (c2 * t) + (c3 * h) + (c4 * t * h) + 
        (c5 * t * t) + (c6 * h * h)+ (c7 * t * t * h) + 
        (c8 * t * h * h) + (c9 * t * t * h * h));
        return heatIndex;
    }

    //Method from DisplayElement interface.
    @Override
    public void display(){
        System.out.println("The heat index is: " + heatIndex);
    }
}
