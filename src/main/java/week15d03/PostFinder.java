package week15d03;

import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public boolean isvalid(Post post) {
        if (post.getContent() == null || post.getContent().isBlank()) {
            throw new IllegalArgumentException("Content must not be empty");
        }
        if (post.getTitle() == null || post.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        return post.isEarlier();
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (isvalid(post) && post.getOwner().equals(user)) {
                result.add(post);
            }
        }
        return result;
    }
}
