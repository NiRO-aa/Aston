package aston.hometask.fifth.Adapter;

public class Starter {

    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter(new Adaptee("Some string."));
        System.out.println(adapter.getData());
        adapter.setData("New String.");
        System.out.println(adapter.getData());
    }

}
