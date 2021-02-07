package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() {
        List<Book> result = new ArrayList<>(library);
        Collections.reverse(result);
        return result;
    }

    public Book getFirstBook() {
        Collections.sort(library);
        return Collections.min(library);
    }

    public Book getLastBook() {
        Collections.sort(library);
        return Collections.max(library);
    }
}
