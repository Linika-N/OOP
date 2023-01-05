package Practice_1.Ex001;

public class Juice extends Product {
    private String composition;

    public Juice(String name, float price, int quantity) {
        super(name, price, quantity);
    }
    public String getComposition() {
        return composition;
    }
    
    public void setComposition(String composition) {
        this.composition = composition;
    }
    
    @Override
    public String toString() {
        return "Juice [name=" + name + ", price=" + price + ", quantity=" + quantity + ", composition=" + composition + "]";
    }
}
