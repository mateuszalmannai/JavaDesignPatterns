package structural.composite.video2brain;

public class CompositeClient {
  public static void main(String[] args) {
    // Construct Tree
    TaskList washingup = new TaskList("Washingup");
    washingup.addTask(new SingleTask("Wash Glasses"));
    washingup.addTask(new SingleTask("Clean Cuttlery"));
    washingup.addTask(new SingleTask("Scrub Pots"));

    TaskList todoList = new TaskList("Things-to-get-done");
    todoList.addTask(washingup);
    SingleTask trash = new SingleTask("Bring out trash");
    SingleTask saveWorld = new SingleTask("Save the World");
    todoList.addTask(trash);
    todoList.addTask(saveWorld);

    // Test
    display("All done?", todoList);
    washingup.complete();
    display("Are we done now?", todoList);
    display("Washed up yet?", washingup);

    trash.complete();
    saveWorld.complete();
    display("World saved?", saveWorld);
    display("Are we done already?", todoList);
  }

  private static void display(String text, Task task) {
    System.out.println(text);
    System.out.println(" -> " + task.getDescription()
      + (task.isCompleted() ? " completed." : " not finished yet."));
    System.out.println();
  }
}
