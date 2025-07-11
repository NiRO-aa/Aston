package aston.hometask.fifth.Builder;

public class Director {

    public Product construct(Builder builder) {
        return builder.setColor().setShape().setSize().build();
    }

}
