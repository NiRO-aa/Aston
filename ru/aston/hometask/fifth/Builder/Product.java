package aston.hometask.fifth.Builder;

public class Product {

    private String color;
    private String shape;
    private int size;

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("This product has %s color, shape of %s and %d size.", color, shape, size);
    }

}
