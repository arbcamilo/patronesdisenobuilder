// Main class to demonstrate the Builder pattern
public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct("Custom Part A", "hola", "mundo");
        Product product = builder.getResult();
        System.out.println(product);
    }
}