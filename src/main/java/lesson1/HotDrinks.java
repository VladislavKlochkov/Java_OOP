package lesson1;

public class HotDrinks extends Drinks {
    private int temperature;

    public HotDrinks(String name, int price, Double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", "
                + "Temperature: "
                + temperature;
    }
}
