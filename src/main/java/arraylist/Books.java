package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> getTitles() {
        return new ArrayList<>(titles);
    }

    public List<String> findAllByPrefix(String prefix) {
        return titles.stream().filter(e -> e.startsWith(prefix)).collect(Collectors.toList());
//        for (String title : titles) {
//            if (title.startsWith(prefix)) {
//                prefixes.add(title);
//            }
//        }
//        return prefixes;
    }

    public void removeByPrefix(String prefix) {
        List<String> deleteByPrefix = findAllByPrefix(prefix);
        titles.removeAll(deleteByPrefix);
    }

    public static void main(String[] args) {
        Books books = new Books();

        books.add("Csendes Don");
        books.add("Spanyol nyeltan");
        books.add("A vadon szava");
        books.add("Római vakáció");
        books.add("Három bajtárs");
        books.add("Mikael Hakim");
        books.add("Fűkoszorú");
        books.add("Spanyol nyelvkönv");
        books.add("Róma első embere");

        System.out.println(books.getTitles() + "\n");

        System.out.println(books.findAllByPrefix("Róma") + "\n");

        books.removeByPrefix("Spa");
        System.out.println(books.getTitles());
    }
}
