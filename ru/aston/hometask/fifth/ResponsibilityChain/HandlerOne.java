package aston.hometask.fifth.ResponsibilityChain;

public class HandlerOne implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handle(String data) {
        if (data.startsWith("1.")) {
            System.out.println("> Was handled by HandlerOne.");
        } else {
            nextHandler.handle(data);
        }
    }

}
