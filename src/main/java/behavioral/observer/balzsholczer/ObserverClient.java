package main.behavioral.observer.balzsholczer;

public class ObserverClient {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();
    new WeatherObserver(weatherStation);

    weatherStation.setHumidity(100);
    weatherStation.setPressure(200);
    weatherStation.setTemperature(300);
  }
}
