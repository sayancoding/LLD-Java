package Behavioral.ObserverPattern.WeatherExample;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TvDisplay();


        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);

        weatherStation.setUpdateInfo("Now Sunny Weather");
        weatherStation.setUpdateInfo("Now Rainy weather");

    }
}
// Output ::
// Update Received at PhoneDisplay :: Now Sunny Weather
// Update Received at TvDisplay :: Now Sunny Weather
// Update Received at PhoneDisplay :: Now Rainy weather
// Update Received at TvDisplay :: Now Rainy weather
