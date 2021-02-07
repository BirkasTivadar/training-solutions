package sorting;

import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        if (library == null || library.isEmpty()) {
            throw new NullPointerException("Libray is empty!");
        }
        TreeSet<Book> result = new TreeSet<>(library);
        return result.first();
    }
}
