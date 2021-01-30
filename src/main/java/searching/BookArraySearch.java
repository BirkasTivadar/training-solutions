package searching;

public class BookArraySearch {
    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if(author == null || title == null || author.isBlank() || title.isBlank()){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        return null;
    }
}
