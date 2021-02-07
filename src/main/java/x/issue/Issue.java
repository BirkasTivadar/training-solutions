package x.issue;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;

    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode){
        this.name = issue.getName();
        this.time = LocalDateTime.of(issue.getTime().toLocalDate(), issue.getTime().toLocalTime());
        this.status = issue.getStatus();
        if(copyMode == CopyMode.WITHOUT_COMMENTS){
            this.comments = new ArrayList<>();
        }
        if(copyMode == CopyMode.WITH_COMMENTS){
            List<Comment> result = new ArrayList<>();
            for(Comment comment : issue.comments){
                result.add(new Comment(comment));
            }
            this.comments = result;
        }
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public void add(Comment comment) {
        comments.add(comment);
    }
}
