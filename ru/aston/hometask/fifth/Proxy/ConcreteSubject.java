package aston.hometask.fifth.Proxy;

public class ConcreteSubject implements Subject {

    private String data;

    public ConcreteSubject() {
        data = "none";
    }

    public ConcreteSubject(String data) {
        this.data = data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

}
