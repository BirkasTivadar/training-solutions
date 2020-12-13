package week07d04;

import java.time.LocalDateTime;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completed = true;
        this.completedAt = completedAt;
    }

    public void complete(LocalDateTime localDateTime) {
        completed = true;
        completedAt = localDateTime;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }
}
