
package data;

import java.util.Random;

public class Dog extends Pet{
    public static final double MAX_SPEED = 60;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        speed = new Random().nextDouble() * MAX_SPEED;
        return speed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|DOG       |%-10s|%-10d|%-10f|%-8f|\n",
                name, yob, weight, getSpeed());
    }

    @Override
    public double runToDead() {
        speed = run() * 3;
        return speed;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|DOG-RACER |%-10s|%-10d|%-10f|%-8f|\n",
                name, yob, weight, getSpeed());
    }
        
}
