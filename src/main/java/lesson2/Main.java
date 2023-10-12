package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Иван");
        Human human2 = new Human("Мария");
        Human human3 = new Human("Петр");

        List<Human> actors = new ArrayList<>();
        actors.add(human1);
        actors.add(human2);
        actors.add(human3);

        Market market = new Market();

        for (Actor actor : actors) {
            market.acceptToMarket(actor);
            market.update();
            market.releaseFromQueue();
        }
    }
}

