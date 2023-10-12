package lesson1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrinks> hdList = new ArrayList<>();
    List<HotDrinks> hdListRes = new ArrayList<>();

    @Override
    public void initProducts() {

    }

    public void initProducts(List<HotDrinks> list) {
        this.hdList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        hdListRes.clear();
        for (HotDrinks hdName : hdList) {
            if (hdName.getName().equalsIgnoreCase(name)) {
                hdListRes.add(hdName);
            }
        }
        return hdListRes.toString();
    }

    public String getProduct(double volume) {
        hdListRes.clear();
        for (HotDrinks hdVol : hdList) {
            if (hdVol.getVolume().equals(volume)) {
                hdListRes.add(hdVol);
            }
        }
        return hdListRes.toString();
    }

    public String getProduct(int temperature) {
        hdListRes.clear();
        for (HotDrinks hdTemp : hdList) {
            if (hdTemp.getTemperature() == temperature) {
                hdListRes.add(hdTemp);
            }
        }
        return hdListRes.toString();
    }

    public String getProduct(String name, double volume, int temperature) {
        hdListRes.clear();
        for (HotDrinks hotDrink : hdList) {
            if (hotDrink.getName().equalsIgnoreCase(name)
                    && hotDrink.getVolume().equals(volume)
                    && hotDrink.getTemperature() == temperature) {
                hdListRes.add(hotDrink);
            }

        }
        return hdListRes.toString();
    }
}
