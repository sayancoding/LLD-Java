package Behavioral.ObserverPattern.WeatherExample;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    List<Observer> observers = new ArrayList<>();

    private String updateInfo;

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        notifyingAll();
    }

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyingAll() {
        for(Observer ob : observers){
            ob.receiveUpdates(updateInfo);
        }
    }
    
}
