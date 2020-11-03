package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> prefixes = new ArrayList<>();
        for(String title : titles){
            if(title.startsWith(prefix)){
                prefixes.add(title);
            }
        }
        return prefixes;
    }

    public void removeByPrefix(String prefix) {
        List<String> deleteByPrefix = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                deleteByPrefix.add(title);
            }
        }
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

        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("Róma"));
        System.out.println();


        // Ezután már csak próbálkozás

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> deleteNumbers = new ArrayList<>();
        deleteNumbers.add(1);
        deleteNumbers.add(3);

        numbers.removeAll(deleteNumbers);

        for(int number : numbers){
            System.out.println(number);
        }









    }




}
