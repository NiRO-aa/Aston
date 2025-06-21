package aston.hometask.second.List;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        System.out.println("Пустой list:\n" + list);

        for (int i = 0; i < 5; i++)
            list.add("a" + i);
        System.out.println("Добавление через add(T value):\n" + list);

        for (int i = 0; i < 5; i++)
            list.add(i, "b" + i);
        System.out.println("Добавление через add(int index, T value):\n" + list);

        for (int i = 0; i < 3; i++)
            list.remove(1);
        System.out.println("Удаление через remove(int index):\n" + list);

        list.remove("a4");
        list.remove("b4");
        System.out.println("Удаление через remove(T value):\n" + list);

        List<String> secondList = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            secondList.add("c" + i);
        list.addAll(secondList);
        System.out.println("Добавление через addAll(Collection<T> collection):\n" + list);

        list.addAll(0, secondList);
        System.out.println("Добавление через addAll(int index, Collection<T> collection):\n" + list);
    }
}
