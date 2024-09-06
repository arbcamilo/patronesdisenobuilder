// Director class
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String partAValue, String partD1, String partD2) {
        builder.buildPartA(partAValue);
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD(partD1, partD2);
    }
}