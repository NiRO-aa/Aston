package aston.hometask.third;

import java.io.BufferedReader;
import java.io.IOException;

public class MenuModule {

    private final BufferedReader reader;
    private Choice choice;

    public MenuModule(BufferedReader reader) {
        choice = Choice.READ;
        this.reader = reader;
    }

    public void choose() throws IOException {
        try {
            System.out.print("Выберите режим работы:\n 1. Запись в файл\n 2. Чтение из файла" +
                    "\n Для выхода введите любой другой символ.\n> ");
            switch (reader.readLine().trim()) {
                case "1" -> choice = Choice.WRITE;
                case "2" ->  choice = Choice.READ;
                default -> choice = Choice.CLOSE;
            }
        } catch (IOException exception) {
            System.out.println("При выборе режима работы произошла ошибка!\n"
                    + exception.getMessage());
            choice = Choice.CLOSE;
        }
    }

    public boolean isReading() {
        return choice.equals(Choice.READ);
    }

    public boolean isWriting() {
        return choice.equals(Choice.WRITE);
    }

}
