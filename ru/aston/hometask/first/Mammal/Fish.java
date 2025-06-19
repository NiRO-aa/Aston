package aston.hometask.first.Mammal;

public abstract class Fish extends Animal implements Water {
    @Override
    public void makeSound() {
        System.out.println("*Рыба скромно молчит...*");
        bubble();
    }
    @Override
    public void move() {
        System.out.println("*Рыба уплывает на глубину*");
    }
    @Override
    public void bubble() {
        System.out.println("o-o-o\nМаленькие пузырьки\no-o-o");
    }
}
