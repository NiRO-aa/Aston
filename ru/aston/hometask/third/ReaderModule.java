package aston.hometask.third;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderModule {

    public void readData(File file) throws CustomException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Содержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            throw new CustomException("При чтении файла произошла ошибка!\n" + exception.getMessage());
        }
    }

}
