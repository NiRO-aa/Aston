package aston.hometask.first.Mammal;

public class Whale extends Mammal implements Water {
    @Override
    public void makeSound() {
        System.out.println("*Кит молчит...*");
    }
    @Override
    public void move() {
        System.out.println("*Кит бьёт хвостом по воде создавая брызги*");
        bubble();
    }
    @Override
    public void bubble() {
        System.out.println("O-O-O-o-o\nБольшие пузырьки\nO-O-O-o-o");
    }
}
