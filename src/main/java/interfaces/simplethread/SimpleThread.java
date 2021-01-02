package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {
    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        if (tasks == null) {
            throw new IllegalArgumentException("Tasks must not be null.");
        }
        this.tasks = new ArrayList<>(tasks);
    }

    public List<String> getTasks() {
        return List.copyOf(tasks);
    }

    private boolean nextStep() {
        if (!tasks.isEmpty()) {
            tasks.remove(tasks.size() - 1);
        }
        return tasks.isEmpty() ? false : true;
    }

    @Override
    public void run() {
        while (nextStep()) {
            nextStep();
        }
    }
}
