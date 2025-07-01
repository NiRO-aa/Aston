package aston.hometask.third;

import java.io.IOException;

public class Starter {

    public static void main(String[] args) {
        Manager manager = new Manager();
        try {
            manager.manage();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
