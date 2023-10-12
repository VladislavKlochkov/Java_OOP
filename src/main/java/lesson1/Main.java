package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cold drinks: \n");
        ColdDrinksVendingMachine vmCD = new ColdDrinksVendingMachine();
        List<ColdDrinks> coldDrinksList = new ArrayList<>(Arrays.asList(
                new ColdDrinks("Coca-Cola", 50, 0.5),
                new ColdDrinks("Lipton", 45, 1.0),
                new ColdDrinks("BonAqua", 55, 1.5)));
        vmCD.initProducts(coldDrinksList);
        System.out.println("Search by name: \n" + vmCD.getProduct("Coca-Cola") + "\n");
        System.out.println("Search by volume: \n" + vmCD.getProduct(1.0) + "\n");
        System.out.println("Search by name and volume: \n" + vmCD.getProduct("Lipton", 1.0) + "\n");
        System.out.println();

        System.out.println("Hot drinks: \n");
        HotDrinksVendingMachine vmHD = new HotDrinksVendingMachine();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Tea", 15, 0.4, 80),
                new HotDrinks("Coffee", 30, 0.2, 60),
                new HotDrinks("Hot chocolate", 25, 0.4, 60),
                new HotDrinks("Cocoa", 15, 0.2, 70)));
        vmHD.initProducts(hotDrinksList);
        System.out.println("Search by name: \n" + vmHD.getProduct("hOt ChOcOlAtE") + "\n");
        System.out.println("Search by volume: \n" + vmHD.getProduct(0.2) + "\n");
        System.out.println("Search by temperature: \n" + vmHD.getProduct(60) + "\n");
        System.out.println("Search by name, volume and temperature: \n" +
                vmHD.getProduct("Tea", 0.4, 80) + "\n");
    }
}
