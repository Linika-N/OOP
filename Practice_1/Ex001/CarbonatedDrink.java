package Practice_1.Ex001;

/**
 * CarbonatedDrinks
 * @param volume - объём напитков
 */
public class CarbonatedDrink extends Product {
    private float volume;

    public CarbonatedDrink(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    public float getVolume() {
        return volume;
    }
    
    public void setVolume(float volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "CarbonatedDrink [name=" + name + ", price=" + price + ", quantity=" + quantity + ", volume=" + volume + "]";
    }

    
}