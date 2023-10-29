package lesson7.cw;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Brasilian", 60.5, 0.3);
        CoffeToCoffeeDecorator coffeeDecorator = new CoffeeDecorator(coffee, false, true);
        coffeeDecorator.printCoffee(coffee);

        CarFactory carFactory = new CarFactory();
        carFactory.createCar("BMW");
        carFactory.createCar("Volvo");
        carFactory.createCar("LADA");

        OldTrain oldTrain127 = new OldTrain(50, 25);
        NewTrain newTrain = new NewTrain(oldTrain127);
        newTrain.move();

    }
}
