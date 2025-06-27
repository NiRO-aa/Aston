package aston.hometask.third;

import java.io.*;

public class Manager {

    private final BufferedReader br;
    private final MenuModule menu;
    private final WriterModule writer;
    private final ReaderModule reader;

    public Manager() {
        br = new BufferedReader(new InputStreamReader(System.in));
        menu = new MenuModule();
        writer = new WriterModule();
        reader = new ReaderModule();
    }

    public void manage() {
        System.out.print("Укажите полный путь до файла:\n> ");
        File file;
        try {
            file = new File(br.readLine());
        } catch (IOException exception) {
            System.out.println("При вводе пути произошла ошибка!");
            return;
        }
        if (!file.exists()) {
            System.out.println("Вы указали неправильный путь!");
            return;
        }
        try {
            do {
                System.out.println("-----");
                menu.choose();
                if (menu.isWriting()) {
                    writer.writeData(file);
                } else if (menu.isReading()) {
                    reader.readData(file);
                }
            } while (menu.isWriting() || menu.isReading());
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
