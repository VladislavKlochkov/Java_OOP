package lesson7.cw;

//Написать класс Кофе
// с несколькими полями и создать декоратор
// для возможности добавления в кофе сахара/сиропов и.т.д
public class Coffee {
    private String type;
    private double temp;
    private double volume;

    public Coffee(String type, double temp, double volume) {
        this.type = type;
        this.temp = temp;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", temp=" + temp +
                ", volume=" + volume +
                '}';
    }
}

class CoffeToCoffeeDecorator {

    protected Coffee coffee;

    public CoffeToCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public void printCoffee(Coffee coffee) {

    }
}

class CoffeeDecorator extends CoffeToCoffeeDecorator {
    private boolean sugar;
    private boolean syrup;

    public CoffeeDecorator(Coffee coffee, boolean sugar, boolean syrup) {
        super(coffee);
        this.sugar = sugar;
        this.syrup = syrup;
    }

    public void printCoffee(Coffee coffee) {
        System.out.println(coffee + "sugar " + sugar + " syrup " + syrup);
    }
}



