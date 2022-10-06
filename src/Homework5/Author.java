package Homework5;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurName='" + authorSurName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSurName.equals(author.authorSurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurName);
    }
}
