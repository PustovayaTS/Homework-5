package Homework5;


public class Book {

    private String bookName;
    private Author bookAuthor;
    private int yearOfPublication;

    public Book(String bookName, Author bookAuthor, int yearOfPublication) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.bookAuthor;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
