package week15d03;

import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public boolean isvalid(Post post) {
        if (post.getTitle() == null ||
                post.getPublishedAt() == null ||
                post.getContent() == null ||
                post.getOwner() == null) {
            throw new IllegalArgumentException("Invalid post");
        }
        return post.isEarlier();
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (isvalid(post) && !post.getContent().isBlank() && !post.getTitle().isBlank() && post.getOwner().equals(user)) {
                result.add(post);
            }
        }
        return result;
    }
}
