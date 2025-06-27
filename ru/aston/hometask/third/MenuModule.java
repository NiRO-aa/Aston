package aston.hometask.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuModule {

    private BufferedReader reader;
    private String choice;

    public MenuModule() {
        choice = "";
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void choose() {
        try {
            System.out.print("Выберите режим работы:\n 1. Запись в файл\n 2. Чтение из файла" +
                    "\n Для выхода введите любой другой символ.\n> ");
            choice = reader.readLine().trim();
        } catch (IOException exception) {
            System.out.println("При выборе режима работы произошла ошибка!\n"
                    + exception.getMessage());
            choice = "";
        }
    }

    public boolean isReading() {
        return choice.equals("2");
    }

    public boolean isWriting() {
        return choice.equals("1");
    }

}
