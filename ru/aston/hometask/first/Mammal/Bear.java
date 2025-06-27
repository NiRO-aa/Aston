package aston.hometask.first.Mammal;

public class Bear extends Mammal implements Wool {
    @Override
    public void dropWool() {
        System.out.println("*Медведь линяет*");
    }
    @Override
    public void makeSound() {
        System.out.println("Медведь рычит: Р-р-р-р");
    }
    @Override
    public void move() {
        System.out.println("*Медведь медленно идет в лес*");
    }
}
