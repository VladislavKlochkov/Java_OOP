package lesson2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;
    public Market() {
        this.queue = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашёл в магазин.");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина.");
            queue.remove(actor);
        }
    }
    @Override
    public void update() {
        takeOrders();
        giveOrders();

    }
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь.");
        this.queue.add(actor);
    }
    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder) {
                System.out.println(actor.getName() + " сделал заказ.");
                actor.setMakeOrder();
            }
        }
    }
    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (!actor.isTakeOrder) {
                System.out.println(actor.getName() + " забрал заказ.");
                actor.setTakeOrder();
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди.");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
