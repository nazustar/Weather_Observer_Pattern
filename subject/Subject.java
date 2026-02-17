package subject;

import observer.Observer;

public interface Subject {
    //Methods for implement on other classes.
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
