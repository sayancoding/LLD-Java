package Behavioral.ObserverPattern.WeatherExample;

public class PhoneDisplay implements Observer{

    @Override
    public void receiveUpdates(String info) {
        System.err.println("Update Received at PhoneDisplay :: "+info);
    }
}
