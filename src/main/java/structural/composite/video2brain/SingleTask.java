package main.structural.composite.video2brain;

public class SingleTask extends Task {
  private boolean done;

  public SingleTask(String description) {
    super(description);
  }

  @Override
  public void complete() {
    done = true;
    System.out.println(" Partial Task \"" + getDescription() + "\" completed. ");
  }

  @Override
  public boolean isCompleted() {
    return done;
  }
}
