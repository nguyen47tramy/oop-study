
package data;

//4 bước: extends - đặc tính nếu có - phễu, dị biệt nếu có - implement abstract methods

import java.util.Random;

public class Raichu extends Pokemon {
    //đặc tính
    protected static final String FIRST_ABILITY = "Static"; //đặc tính chung của tất cả các con Pichu
    protected boolean hiddenAbility;
    protected static final int EV_YIELD_NUMBER = 3;
    protected static final String EV_YIELD_STATS = "Speed";
    protected static final int MAX_SPEED = 350;
    //protected int speed;
    
    //phễu
    public Raichu(String name, int nationalNumber, String type, String species, double height, boolean hiddenAbility) {
        super(name, nationalNumber, type, species, height);
        this.hiddenAbility = hiddenAbility;
    }

    public boolean isHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(boolean hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    
    
    //implement all abstract code

    @Override
    public int run() {
        speed = new Random().nextInt(MAX_SPEED);
        return speed;
    }   

    @Override
    public String speak() {
        return "Grr, grr";
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-4d|%-10s|%-15s|%-7d|\n",
                name, nationalNumber, type, species, speed );
    }
}
