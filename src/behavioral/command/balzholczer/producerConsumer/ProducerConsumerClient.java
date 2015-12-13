package behavioral.command.balzholczer.producerConsumer;

public class ProducerConsumerClient {
  public static void main(String[] args) {

    Algorithm algorithm = new Algorithm();

    Thread t1 = new Thread(algorithm::produce);

    Thread t2 = new Thread(algorithm::consume);

    t1.start();

    t2.start();
  }
}
