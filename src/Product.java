// Product class
public class Product {
    private String partA;
    private String partB;
    private String partC;
    private String partD1;
    private String partD2;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void setPartD(String partD1, String partD2) {
        this.partD1 = partD1;
        this.partD2 = partD2;
    }

    @Override
    public String toString() {
        return "Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + ", partD1=" + partD1 + ", partD2=" + partD2 + "]";
    }
}