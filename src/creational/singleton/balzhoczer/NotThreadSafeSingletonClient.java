package creational.singleton.balzhoczer;

public class NotThreadSafeSingletonClient {
  public static void main(String[] args) {
    NotThreadSafeEagerSingleton notThreadSafeEagerSingleton = NotThreadSafeEagerSingleton.getInstance();
    notThreadSafeEagerSingleton.setCounter(10);
    System.out.println(notThreadSafeEagerSingleton.getCounter());

    NotThreadSafeLazySingleton notThreadSafeLazySingleton = NotThreadSafeLazySingleton.getInstance();
    notThreadSafeLazySingleton.setCounter(20);
    System.out.println(notThreadSafeLazySingleton.getCounter());
  }
}
