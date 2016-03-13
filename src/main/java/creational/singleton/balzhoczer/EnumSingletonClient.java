package main.creational.singleton.balzhoczer;

public class EnumSingletonClient {
  public static void main(String[] args) {

    ThreadSafeSingletonEnum.INSTANCE.setCounter(10);

    System.out.println(ThreadSafeSingletonEnum.INSTANCE.getCounter());
  }
}
