package behavioral.state.balzholczer;

public class OffState implements State{

  @Override
  public void doAction(Context context) {
    System.out.println("This is off state...");
    context.setState(this);
  }

  @Override
  public String toString() {
    return "OffState{}";
  }
}
