package lesson7.cw;
//Создать класс АвтомобильнаяФабрика
// с возможностью выпуска нескольких автомобилей
// (Каждый тип авто - отдельный класс)

public class CarFactory {

    public ICar createCar(String carType) {
        switch (carType) {
            case ("BMW"):
                System.out.println("Created BMW");
                return new BMW("X5");
            case ("Volvo"):
                System.out.println("Created Volvo");
                return new Volvo("XC90");

            case ("Mercedes"):
                System.out.println("Created Mercedes");
                return new Mersedes("E100");
            default:
                System.out.println("Car not created!");
                break;
        }
        return null;
    }
}

class Volvo implements ICar {
    private String model;

    public Volvo(String model) {
        this.model = model;
    }
}

class Mersedes implements ICar {
    private String model;

    public Mersedes(String model) {
        this.model = model;
    }

}

class BMW implements ICar {
    public String model;

    public BMW(String model) {
        this.model = model;
    }
}

