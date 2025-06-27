package aston.hometask.first.Mammal;

public class Cat extends Mammal implements Wool{
    @Override
    public void dropWool() {
        System.out.println("*Кошка линяет*");
    }
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу!");
    }
    @Override
    public void move() {
        System.out.println("*Кошка крадется в вашу сторону*");
    }
}
