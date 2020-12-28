package objectclass;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return author + " " + title;
    }

    public boolean equals(Object o){
        return  o instanceof Book && toString().equals(o.toString());
    }


}
