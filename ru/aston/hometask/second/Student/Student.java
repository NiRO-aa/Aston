package aston.hometask.second.Student;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Book> books;

    public Student(String name, int age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        StringBuilder booksBuilder = new StringBuilder();

        for (Book b : books)
            booksBuilder.append(b).append(", ");
        if (booksBuilder.length() > 1)
            booksBuilder.delete(booksBuilder.length() - 2, booksBuilder.length());

        return String.format("[Студент: %s - %s лет; Список книг: %s]", name, age, booksBuilder);
    }
}
