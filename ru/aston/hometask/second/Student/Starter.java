package aston.hometask.second.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Starter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Смирнова Алина", 15, new ArrayList<>(Arrays.asList(
                new Book("Преступление и наказание", "Фёдор Достоевский", 1866, 551),
                new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997, 432),
                new Book("1984", "Джордж Оруэлл", 1949, 328),
                new Book("Убийство в \"Восточном экспрессе\"", "Агата Кристи", 1934, 256),
                new Book("Тонкое искусство пофигизма", "Марк Мэнсон", 2016, 224)))));

        students.add(new Student("Козлов Артём", 17,new ArrayList<>(Arrays.asList(
                new Book("Война и мир", "Лев Толстой", 1869, 1225),
                new Book("Жутко громко и запредельно близко", "Джонатан Сафран Фоер", 2005, 368),
        new Book("О дивный новый мир", "Олдос Хаксли", 1932, 288),
                new Book("Остров сокровищ", "Роберт Льюис Стивенсон", 1883, 292),
                new Book("7 навыков высокоэффективных людей", "Стивен Кови", 1989, 396)
        ))));
        students.add(new Student("Петрова София", 16, new ArrayList<>(Arrays.asList(
                new Book("Американские боги", "Нил Гейман", 2001, 635),
                new Book("Автостопом по галактике", "Дуглас Адамс", 1979, 224),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 480),
                new Book("Три товарища", "Эрих Мария Ремарк", 1936, 384),
                new Book("Девушка с татуировкой дракона", "Стиг Ларссон", 2005, 542)
        ))));
        students.add(new Student("Николаев Максим", 14, new ArrayList<>(Arrays.asList(
                new Book("Три сестры", "Александр Чехов", 1901, 128),
                new Book("Нормальные люди", "Салли Руни", 2018, 288),
                new Book("Девушка в поезде", "Пола Хокинс", 2015, 448),
                new Book("Краткая история времени", "Стивен Хокинг", 1988, 256),
                new Book("Богатый папа, бедный папа", "Роберт Кийосаки", 1997, 336)
        ))));
        students.add(new Student("Фёдорова Виктория", 15, new ArrayList<>(Arrays.asList(
                new Book("1984", "Джордж Оруэлл", 1949, 328),
                new Book("Имя ветра", "Патрик Ротфусс", 2007, 662),
                new Book("Убийство в \"Восточном экспрессе\"", "Агата Кристи", 1934, 256),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 480),
                new Book("Маленькая жизнь", "Ханья Янагихара", 2015, 736)
        ))));

        students.stream().
                peek(s -> System.out.println(s)).
                map(s -> s.getBooks().stream().
                        sorted((b1, b2) -> b1.getPages() - b2.getPages()).
                        distinct().
                        filter(b -> b.getYear() > 2000).
                        limit(3).
                        map(b -> {
                            if (b != null || false)
                                return Optional.of(b);
                            return Optional.ofNullable(b);
                        }).
                        peek(o -> {
                            if (o.isPresent())
                                System.out.println(o.get().getYear());
                            else System.out.println("Книга отсутствует!");
                        }).
                        toList()).
                toList();
    }
}
