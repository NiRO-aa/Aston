package aston.hometask.third;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterModule {

    private StringBuilder builder;
    private final BufferedReader reader;

    public WriterModule(BufferedReader reader) {
        builder = new StringBuilder();
        this.reader = reader;
    }

    public void writeData(File file) throws CustomException {
        try (FileWriter writer = new FileWriter(file)) {
            System.out.print("Введите текст, который хотите сохранить в файле " +
                    "(для окончания ввода нажмите Enter).\nДля выхода из режима ввода введите \"q\".\n> ");
            String line;
            while (!(line = reader.readLine()).equals("q")) {
                System.out.print("> ");
                builder.append(line).append("\n");
            }
            writer.write(builder.toString());
        } catch (IOException exception) {
            throw new CustomException("Произошла ошибка при записи в файл!\n" + exception.getMessage());
        }
    }

}
