package collectionscomp;

import java.text.Collator;
import java.util.*;
import java.util.concurrent.Callable;

public class OrderedLibrary {

    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        Collections.sort(libraryBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return libraryBooks;
    }

    public List<Book> orderedByAuthor() {
        Collections.sort(libraryBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return libraryBooks;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> titles = new ArrayList<>();
        for (Book book : libraryBooks) {
            titles.add(book.getTitle());
        }
        Collections.sort(titles, Collator.getInstance(locale));
        return titles;
    }
}
