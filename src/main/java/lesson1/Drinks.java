package lesson1;

public class Drinks extends Product {
    private Double volume;

    public Drinks(String name, int price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("The volume of the drink must be greater than zero");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + ", "
                + "Volume: "
                + volume;

    }
}
