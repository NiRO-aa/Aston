package aston.hometask.fifth.Proxy;

public class Starter {

    public static void main(String args[]) {
        Subject defaultSubject = new Proxy();
        defaultSubject.setData("Beautiful summer ^O^");
        System.out.println(defaultSubject.getData());

        Subject subject = new Proxy("|o_o|");
        System.out.println(subject.getData());
    }

}
