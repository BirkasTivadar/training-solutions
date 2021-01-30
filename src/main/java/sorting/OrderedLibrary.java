package sorting;

import java.util.*;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        if (library.isEmpty()) {
            throw new NullPointerException("Libray is empty!");
        }
        Set<Book> result = new TreeSet<>(library);
        Iterator<Book> i = result.iterator();
        return i.next();
    }
}
