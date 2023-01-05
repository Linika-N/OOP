package Practice_1.Ex001;

public class HotDrink extends Product {
    private float temperature;
    private float volume;

    public HotDrink(String name, float price, int quantity) {
        super(name, price, quantity);
    }
    public float getVolume() {
        return volume;
    }
    
    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getTemperature() {
        return temperature;
    }
    
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", price=" + price + ", quantity=" + quantity + ", temperature=" + temperature + ", volume=" + volume + "]";
    }

}
