package Behavioral.ObserverPattern.WeatherExample;

public class TvDisplay implements Observer{
    @Override
    public void receiveUpdates(String info) {
        System.err.println("Update Received at TvDisplay :: "+info);
    }
}
