package Practice_1.Ex001;

public class HotDrinkVendingMashine extends VendingMashine {

    public HotDrinkVendingMashine(String name) {
        super(name);        
    }
    
    @Override
    public Product showPrice(int choice) {
        Product forSale = productSet.get(choice);
        System.out.printf("Выбран товар: %s, стоимость %.2f\n", (forSale.getName() +", volume=" +((HotDrink) forSale).getVolume()+", temperature=" + ((HotDrink) forSale).getTemperature()), forSale.getPrice());
        return forSale;
    }
    @Override
    public String toString() {
        return "OneKindVendingMashine [name= " + super.getName() + "]";
    }

    @Override
    public void addProduct(int code, Product product) {
        super.addProduct(code, product);
    }
    
    

}
