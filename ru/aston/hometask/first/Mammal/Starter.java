package aston.hometask.first.Mammal;

public class Starter {
    public static void main(String[] args) {
        Animal animal = new Bear();
        animal.makeSound();
        animal.move();

        System.out.println();
        Mammal mammal = new Cat();
        mammal.makeSound();
        mammal.feed();

        System.out.println();
        mammal = new Whale();
        mammal.move();

        System.out.println();
        Fish fish = new Fish();
        fish.move();
        fish.bubble();
    }
}