package aston.hometask.fifth.Decorator;

public class ConcreteComponent implements Component {

    private String data;

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

}
