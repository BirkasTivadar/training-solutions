package x;

import java.util.ArrayDeque;
import java.util.Deque;

public class JobQueue {

    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> result = new ArrayDeque<>();
        for (Job job : jobs) {
            if (job.isUrgent()) {
                result.addFirst(job);
            } else {
                result.addLast(job);
            }
        }
        return result;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        if (jobs == null || jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.pollFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException {
        if (jobs == null || jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.pollLast();
    }
}
