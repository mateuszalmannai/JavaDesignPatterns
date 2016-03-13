package main.behavioral.observer.balzsholczer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

  private int pressure;
  private int temperature;
  private int humidity;

  private List<Observer> observerList;

  public WeatherStation() {
    observerList = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observerList.indexOf(observer));
  }

  @Override
  public void notifyAllObservers() {
    for (Observer observer : observerList) {
      observer.update(pressure, temperature, humidity);
    }
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
    notifyAllObservers();
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyAllObservers();
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
    notifyAllObservers();
  }
}
