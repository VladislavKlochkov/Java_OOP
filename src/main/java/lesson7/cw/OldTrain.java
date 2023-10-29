package lesson7.cw;

//Создать класс oldTrain с полями speed и length и адаптер для этого класса newTrain с методом
// move(печать того, что поезд начал движения и значения полей из oldTrain)
public class OldTrain {
    private int speed;

    private int length;

    public OldTrain(int speed, int length) {
        this.speed = speed;
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "OldTrain{" +
                "speed=" + speed +
                ", length=" + length +
                '}';
    }
}

class NewTrain {
    private OldTrain oldTrain;

    public NewTrain(OldTrain oldTrain) {
        this.oldTrain = oldTrain;
    }

    public void move(){
        System.out.println("Поезд начал движение: "
                + oldTrain.getSpeed()
                + " "
                + oldTrain.getLength());
    }
}