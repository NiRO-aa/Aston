package aston.hometask.second.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int age;
    public List<Book> books = new ArrayList<>();

    public Student(String name, int age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
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
