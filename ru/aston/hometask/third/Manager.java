package aston.hometask.third;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;

public class Manager {

    private final BufferedReader br;
    private final MenuModule menu;
    private final WriterModule writer;
    private final ReaderModule reader;

    public Manager() {
        br = new BufferedReader(new InputStreamReader(System.in));
        menu = new MenuModule(br);
        writer = new WriterModule(br);
        reader = new ReaderModule();
    }

    public void manage() throws IOException {

        System.out.print("Укажите полный путь до файла:\n> ");
        File file;

        try (br) {
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
                while (menu.isWriting() || menu.isReading()) {
                    System.out.println("-----");
                    menu.choose();
                    if (menu.isWriting()) {
                        writer.writeData(file);
                    } else if (menu.isReading()) {
                        reader.readData(file);
                    }
                }
            } catch (CustomException | IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}
