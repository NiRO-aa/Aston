package aston.hometask.fifth.ResponsibilityChain;

public class HandlerTwo implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handle(String data) {
        if (data.startsWith("2.")) {
            System.out.println("> Was handled by HandlerTwo.");
        } else {
            nextHandler.handle(data);
        }
    }

}
