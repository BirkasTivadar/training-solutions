package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void testPostFinderWithNullContent() {
        Post post1 = new Post("", LocalDate.of(2019, 12, 20), null, "Tivadar");
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        PostFinder postFinder = new PostFinder(posts);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> postFinder.findPostsFor("Tivadar"));
        assertEquals("Invalid post", iae.getMessage());
    }

    @Test
    void testPostFinder() {
        Post post1 = new Post("Győr", LocalDate.of(2019, 12, 20), "hello tivadar", "Tivadar");
        Post post2 = new Post("Málaga", LocalDate.of(2020, 12, 20), "hello josé", "José");
        Post post3 = new Post("Madrid", LocalDate.of(2021, 12, 20), "hello", "José");
        Post post4 = new Post("La Habana", LocalDate.of(2021, 12, 20), "", "José");
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        PostFinder postFinder = new PostFinder(posts);
        assertEquals(1, postFinder.findPostsFor("José").size());
    }


}