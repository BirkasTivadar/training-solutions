package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable{
    private List<String> task = new ArrayList<>();

    public SimpleThread(List<String> task) {
        this.task = task;
    }

    public List<String> getTask() {
        return task;
    }

    private boolean nextStep(){
        task.remove(task.size()-1);
        return task.isEmpty() ? false : true;

    }

    @Override
    public void run() {
        while(nextStep()){
            nextStep();
        }
    }
}
