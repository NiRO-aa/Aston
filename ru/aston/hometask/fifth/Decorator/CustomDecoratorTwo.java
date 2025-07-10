package aston.hometask.fifth.Decorator;

public class CustomDecoratorTwo extends Decorator {

    private Component component;

    public CustomDecoratorTwo(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void setData(String data) {
        System.out.println("Data setting through CustomDecoratorTwo!");
        component.setData(data);
        System.out.println("Successfully!");
    }

    @Override
    public String getData() {
        return String.format("!(%s)", component.getData());
    }

}
