package behavioral.command.balzholczer.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

  /**
   * BlockingQueue is threadsafe: we don't have to bother with synchronized blocks.
   * Only a single thread can manipulate this list at a time.
   */
  private BlockingQueue<Command> commandList;

  public Algorithm() {
    commandList = new ArrayBlockingQueue<>(10);
  }

  // Add items to the commandList
  public void produce() {
    for (int i = 0; i < 10; i++) {
      try {
        commandList.put(new TaskSolver(new Task(i+1)));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  // Get commands from the list
  public void consume() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
        commandList.take().execute();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
