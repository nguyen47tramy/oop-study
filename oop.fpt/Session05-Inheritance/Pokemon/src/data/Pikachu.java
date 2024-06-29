
package data;

//4 bước: extends - đặc tính nếu có - phễu, dị biệt nếu có - implement abstract methods

import java.util.Random;

public class Pikachu extends Pokemon{
    //đặc tính
    protected static final String FIRST_ABILITY = "Static"; //đặc tính chung của tất cả các con Pichu
    protected boolean hiddenAbility;
    protected static final int EV_YIELD_NUMBER = 2;
    protected static final String EV_YIELD_STATS = "Speed";
    protected static final int MAX_SPEED = 306;
    
    
    //phễu

    public Pikachu(String name, int nationalNumber, String type, String species, double height, boolean hiddenAbility) {
        super(name, nationalNumber, type, species, height);
        this.hiddenAbility = hiddenAbility;
    }
    //getter setter
    public boolean isHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(boolean hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    
    
    //implement abstract methods

    @Override
    public int run() {
        speed = new Random().nextInt(MAX_SPEED);
        return speed;
    }

    @Override
    public String speak() {
        return "Pika, pika!";
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-4d|%-10s|%-15s|%-7d|\n",
                name, nationalNumber, type, species, speed );
    }
}
