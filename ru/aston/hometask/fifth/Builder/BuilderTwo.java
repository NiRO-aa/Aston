package aston.hometask.fifth.Builder;

public class BuilderTwo implements Builder {

    private Product product;

    public BuilderTwo(Product product) {
        this.product = product;
    }

    @Override
    public Builder setColor() {
        product.setColor("Purple");
        return this;
    }

    @Override
    public Builder setShape() {
        product.setShape("Ring");
        return this;
    }

    @Override
    public Builder setSize() {
        product.setSize(7);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
