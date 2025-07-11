package aston.hometask.fifth.Adapter;

public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getData() {
        return adaptee.getDoubleDescriptionString();
    }

    @Override
    public void setData(String value) {
        adaptee.setNewDescriptionString(value);
    }

}
