package aston.hometask.third;

import java.io.*;

public class WriterModule {

    private StringBuilder builder;
    private BufferedReader reader;

    public WriterModule() {
        builder = new StringBuilder();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void writeData(File file) throws CustomException {
        try {
            FileWriter writer = new FileWriter(file);
            System.out.print("Введите текст, который хотите сохранить в файле " +
                    "(для окончания ввода нажмите Enter).\nДля выхода из режима ввода введите \"q\".\n> ");
            String line;
            while (!(line = reader.readLine()).equals("q")) {
                System.out.print("> ");
                builder.append(line).append("\n");
            }
            writer.write(builder.toString());
            writer.close();
        } catch (IOException exception) {
            throw new CustomException("Произошла ошибка при записи в файл!\n" + exception.getMessage());
        }
    }

}
