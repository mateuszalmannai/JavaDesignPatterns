package behavioral.observer.video2brain.withImprovedObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
  private final List<Observer<T>> observers = new ArrayList<>();

  public final void register(Observer<T> observer) {
    observers.add(observer);
  }

  public final void remove(Observer<T> observer) {
    observers.remove(observer);
  }

  protected final void informObservers(T newValue) {
    for (Observer<T> observer : observers) {
      observer.changeValue(newValue);
    }
  }
}
