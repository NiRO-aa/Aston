package aston.hometask.fifth.Decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void setData(String data) {
        component.setData(data);
    }

    @Override
    public String getData() {
        return component.getData();
    }

}
