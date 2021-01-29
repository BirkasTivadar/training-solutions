package collectionsqueue.job;

public class Job implements Comparable {

    private int priority;
    private String jobDescription;
    private boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        if (priority < 5) {
            this.urgent = true;
        } else {
            this.urgent = false;
        }
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Object o) {
        return this.priority - ((Job) o).priority;
    }
}
