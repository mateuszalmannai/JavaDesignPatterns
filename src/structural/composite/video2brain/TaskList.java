package structural.composite.video2brain;

import java.util.ArrayList;
import java.util.List;

public class TaskList extends Task {

  private List<Task> taskList;

  public TaskList(String description) {
    super(description);
    taskList = new ArrayList<>();
  }

  @Override
  public void complete() {
    for (Task task : taskList) {
      task.complete();
    }
  }

  @Override
  public boolean isCompleted() {
    boolean isDone = true;
    for (Task task : taskList) {
      if (!task.isCompleted()) {
        isDone = false;
      }
    }
    return isDone;
  }

  public void addTask(Task task) {
    taskList.add(task);
  }
}
