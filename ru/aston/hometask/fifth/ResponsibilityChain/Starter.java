package aston.hometask.fifth.ResponsibilityChain;

public class Starter {

    public static void main(String[] args) {
        Handler handlerOne = new HandlerOne();
        Handler handlerTwo = new HandlerTwo();
        Handler handlerThree = new HandlerThree();

        handlerOne.setNextHandler(handlerTwo);
        handlerTwo.setNextHandler(handlerThree);

        handlerOne.handle("0. ...");
        handlerOne.handle("1. ...");
        handlerOne.handle("2. ...");
        handlerOne.handle("3. ...");
    }

}
