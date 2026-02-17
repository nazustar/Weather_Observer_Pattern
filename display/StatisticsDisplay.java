package display;

import observer.Observer;
import subject.Subject;
import observer.DisplayElement;

public class StatisticsDisplay implements DisplayElement, Observer{

    //Attributes.
    private float maxTemp = -Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum;
    private int numReadings;

    //Constructor that registers the observer to the subject for display.
    public StatisticsDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    //Implementation from Observer.
    @Override
    public void update(float t, float h, float p){
        tempSum += t;
        numReadings++;
        maxTemp = Math.max(maxTemp, t);
        minTemp = Math.min(minTemp, t);
        display();
    }

    //Implementation from DisplayEement.
    @Override
    public void display(){
        float average = tempSum / numReadings;
        System.out.println("Stadistics Display");
        System.out.println("-----------------------");
        System.out.println("Maxim temperature: " + maxTemp);
        System.out.println("Minimal temperature: " + minTemp);
        System.out.println("Average temperature: " + average);
        System.out.println("-----------------------");
    }
}