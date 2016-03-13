package main.behavioral.state.balzholczer;

public class StateClient {

  public static void main(String[] args) {
    Context context = new Context();
    OnState onState = new OnState();
    onState.doAction(context);
    System.out.println(context.getState().toString());

    OffState offState = new OffState();
    offState.doAction(context);
    System.out.println(context.getState().toString());
  }
}
