package main.structural.composite.video2brain;

public abstract class Task {
  private final String description;

  public Task(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract void complete();

  public abstract boolean isCompleted();
}
