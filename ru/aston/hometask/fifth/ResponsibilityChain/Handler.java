package aston.hometask.fifth.ResponsibilityChain;

public interface Handler {

    void setNextHandler(Handler handler);

    void handle(String data);

}
