package aston.hometask.fifth.Builder;

public class Starter {

    public static void main(String[] args) {
        Director director = new Director();

        Product productOne = director.construct(new BuilderOne(new Product()));
        Product productTwo = director.construct(new BuilderTwo(new Product()));

        System.out.println(productOne);
        System.out.println(productTwo);
    }

}
