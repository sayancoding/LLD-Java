package Behavioral.ObserverPattern.WeatherExample;

interface Subject {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyingAll();
}
