package lesson1;

import java.util.ArrayList;
import java.util.List;

public class ColdDrinksVendingMachine implements VendingMachine {
    List<ColdDrinks> cdList = new ArrayList<>();
    List<ColdDrinks> cdListRes = new ArrayList<>();


    @Override
    public void initProducts() {
    }

    public void initProducts(List<ColdDrinks> cd) {
        this.cdList = cd;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        cdListRes.clear();
        for (ColdDrinks cdName : cdList) {
            if (cdName.getName().equalsIgnoreCase(name)) {
                cdListRes.add(cdName);
            }
        }
        return cdListRes.toString();
    }

    public String getProduct(double volume) {
        cdListRes.clear();
        for (ColdDrinks cdVol : cdList) {
            if (cdVol.getVolume().equals(volume)) {
                cdListRes.add(cdVol);
            }
        }
        return cdListRes.toString();
    }

    public String getProduct(String name, double volume) {
        cdListRes.clear();
        for (ColdDrinks coldDrink : cdList) {
            if (coldDrink.getName().equalsIgnoreCase(name)
                    && coldDrink.getVolume().equals(volume)) {
                cdListRes.add(coldDrink);
            }

        }
        return cdListRes.toString();
    }
}
