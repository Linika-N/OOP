package Practice_1.Ex001;

public class Crisp extends Product {
    private String flavour;

    public Crisp(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    
    public String getFlavour() {
        return flavour;
    }
    
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    
    @Override
    public String toString() {
        return "Crisp [name=" + name + ", price=" + price + ", quantity=" + quantity + ", flavour=" + flavour + "]";
    }

}
