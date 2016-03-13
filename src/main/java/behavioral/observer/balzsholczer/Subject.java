package main.behavioral.observer.balzsholczer;

public interface Subject {
  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyAllObservers();
}
