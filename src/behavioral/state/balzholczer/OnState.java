package behavioral.state.balzholczer;

public class OnState implements State {
  @Override
  public void doAction(Context context) {
    System.out.println("This is the on state...");
    context.setState(this);
  }

  @Override
  public String toString() {
    return "OnState{}";
  }
}
