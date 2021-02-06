package x;

import java.text.Collator;
import java.util.*;
import java.util.concurrent.Callable;

public class OrderedLibrary {

    List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> result = new ArrayList<>(libraryBooks);
        Collections.sort(result);
        return result;
    }

    public List<Book> orderedByAuthor() {
        List<Book> result = new ArrayList<>(libraryBooks);
        Collections.sort(result, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return result;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> result = new ArrayList<>();
        for (Book book : libraryBooks) {
            result.add(book.getTitle());
        }
        Collections.sort(result, Collator.getInstance(locale));
        return result;
    }
}
