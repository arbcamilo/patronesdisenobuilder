// Builder interface
public interface Builder {
    void buildPartA(String partAValue);
    void buildPartB();
    void buildPartC();
    void buildPartD(String partD1, String partD2);
    Product getResult();
}