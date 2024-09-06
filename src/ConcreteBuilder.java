// ConcreteBuilder class
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA(String value) {
        product.setPartA(value);
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Part C");
    }

    @Override
    public void buildPartD(String partD1, String partD2) {
        product.setPartD(partD1, partD2);
    }

    @Override
    public Product getResult() {
        return product;
    }
}