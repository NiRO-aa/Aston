package aston.hometask.fifth.Decorator;

public class CustomDecoratorOne extends Decorator {

    private Component component;

    public CustomDecoratorOne(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void setData(String data) {
        component.setData(String.format(">>> %s <<<", data));
    }

}
