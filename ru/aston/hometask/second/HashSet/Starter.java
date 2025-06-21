package aston.hometask.second.HashSet;

public class Starter {
    public static void main(String[] args) {
        CustomHashSet<Integer> set = new CustomHashSet<>();
        System.out.println("Пустой set: " + set);

        set.add(null);
        set.add(null);
        System.out.println("Попытка добавить null: " + set);

        for (int i = 0; i < 20; i++)
            set.add(i);
        System.out.println("Добавление уникальных элементов: " + set);

        for (int i = 0; i < 10; i++)
            set.add(i);
        System.out.println("Попытка добавить повторяющиеся элементы: " + set);

        for (int i = 0; i < 100; i++)
            if (i % 2 == 0)
                set.remove(i);
        System.out.println("Удаление элементов: " + set);
    }
}
