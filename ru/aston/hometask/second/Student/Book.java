package aston.hometask.second.Student;

public class Book {
    private String name;
    private String author;
    private int publicationYear;
    private int pages;

    public Book(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        publicationYear = year;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return publicationYear;
    }
    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return String.format("[\"%s\", %s, %d г., %d стр.]", name, author, publicationYear, pages);
    }
}