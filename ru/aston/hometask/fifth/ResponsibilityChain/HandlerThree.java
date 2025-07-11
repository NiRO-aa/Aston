package aston.hometask.fifth.ResponsibilityChain;

public class HandlerThree implements Handler {

    @Override
    public void setNextHandler(Handler handler) {
        System.out.println("There are no handlers after HandlerThree.");
    }

    @Override
    public void handle(String data) {
        if (data.startsWith("3.")) {
            System.out.println("> Was handled by HandlerThree.");
        } else {
            System.out.println("> Data could not be handled.");
        }
    }

}
