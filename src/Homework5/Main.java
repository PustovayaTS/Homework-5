package Homework5;

public class Main {
    public static void main(String[] args) {
        Author authorName = new Author("Nikolai","Gogol");
        Book deadSouls = new Book("Dead Souls", authorName, 1842);
        System.out.println("Book name = " + deadSouls.getBookName());

        Author authorName2 = new Author("Alexandr","Pushkin");
        Book ruslanAndLudmila = new Book("Ruslan and Ludmila", authorName2, 1820);
        System.out.println("Book name = " + ruslanAndLudmila.getBookName());

        ruslanAndLudmila.setYearOfPublication(1825);
        System.out.println("YearOfPublication = " + ruslanAndLudmila.getYearOfPublication());

    }
}