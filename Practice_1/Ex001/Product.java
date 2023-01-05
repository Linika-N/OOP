package Practice_1.Ex001;
/**
 * Товары и продукты
 * 
 * @param name     - наименование продукта
 * @param price    - цена за 1 единицу продукта
 * @param quantity - общее количество имеющихся продуктов
 */

public class Product {

    protected String name;
    protected float price;
    protected int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        if (this instanceof CarbonatedDrink)
        return "CarbonatedDrinks [name=" + name + ", price=" + price + ", quantity=" + quantity + ", volume=" + ((CarbonatedDrink) this).getVolume() + "]";
        if (this instanceof HotDrink)
        return "HotDrinks [name=" + name + ", price=" + price + ", quantity=" + quantity + ", temperature=" + ((HotDrink) this).getTemperature() + ", volume=" + ((HotDrink)this).getVolume() + "]";
        if (this instanceof Juice)
        return "Juices [name=" + name + ", price=" + price + ", quantity=" + quantity + ", flavour=" + ((Juice)this).getComposition() + "]";
        if (this instanceof Crisp)
        return "Crisp [name=" + name + ", price=" + price + ", quantity=" + quantity + ", flavour=" + ((Crisp)this).getFlavour() + "]";
        else
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
