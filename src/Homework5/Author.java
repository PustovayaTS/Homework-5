package Homework5;

public class Author {
    String authorName;
    String authorSurName;

    public Author(String authorName, String authorSurName) {
        this.authorName = authorName;
        this.authorSurName = authorSurName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurName() {
        return this.authorSurName;
    }
}
