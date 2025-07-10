package aston.hometask.fifth.Decorator;

public class Starter {

    public static void main(String[] args) {
        Component defaultComponent = new ConcreteComponent();
        defaultComponent.setData("default data :(");
        System.out.println(defaultComponent.getData());

        Component customOne = new CustomDecoratorOne(new ConcreteComponent());
        customOne.setData("custom Data :)");
        System.out.println(customOne.getData());

        Component customTwo = new CustomDecoratorTwo(new ConcreteComponent());
        customTwo.setData("data... (0_0)");
        System.out.println(customTwo.getData());
    }

}
