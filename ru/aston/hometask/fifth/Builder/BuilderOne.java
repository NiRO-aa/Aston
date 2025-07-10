package aston.hometask.fifth.Builder;

public class BuilderOne implements Builder {

    private Product product;

    public BuilderOne(Product product) {
        this.product = product;
    }

    @Override
    public Builder setColor() {
        product.setColor("Blue");
        return this;
    }

    @Override
    public Builder setShape() {
        product.setShape("Star");
        return this;
    }

    @Override
    public Builder setSize() {
        product.setSize(10);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
