package aston.hometask.fifth.Proxy;

public class Proxy implements Subject {

    private Subject subject;
    private String preset;

    public Proxy() {
        subject = new ConcreteSubject();
        preset = "";
        System.out.println("> ConcreteSubject instance was created through default constructor.");
    }

    public Proxy(String data) {
        subject = new ConcreteSubject(data);
        preset = "--->";
        System.out.println(String.format("> ConcreteSubject instance was created.\n> \"%s\" value was setting.", data));
    }

    @Override
    public void setData(String data) {
        subject.setData(String.format("%s", data));
    }

    @Override
    public String getData() {
        return String.format("%s %s", preset, subject.getData().toUpperCase());
    }

}
