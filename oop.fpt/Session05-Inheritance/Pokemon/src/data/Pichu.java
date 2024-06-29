
package data;
//Pichu là loài pokemon cụ thể, khi nói về Pichu ta hình dung được nó rõ ràng, sức mạnh ntn 
//==> không nên để abstract mà nên cụ thể code

import java.util.Random;


//4 bước: extends - đặc tính nếu có - phễu, dị biệt nếu có - implement abstract methods

public class Pichu extends Pokemon{
    // đặc tính nếu có
    protected static final String FIRST_ABILITY = "Static"; //đặc tính chung của tất cả các con Pichu
    protected boolean hiddenAbility;
    protected static final int EV_YIELD_NUMBER = 1;
    protected static final String EV_YIELD_STATS = "Speed";
    protected static final int MAX_SPEED = 240;
    //protected int speed; //biến lưu giá trị cố định mỗi khi random hàm run()

    public Pichu(String name, int nationalNumber, String type, String species, double height, boolean hiddenAbility) {
        super(name, nationalNumber, type, species, height);
        this.hiddenAbility = hiddenAbility;
        
    }

    

        
    public boolean isHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(boolean hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    //implement abstract class
    @Override
    public int run() {
        //dựa theo Speed của loài
        //random trong khoảng cho trước, sử dụng hàm random đã viết trước của java.util
        //hai cách, một là tạo biến con trỏ, hai là dùng anonymos objetc
        //  cách 1:
        //Random soNgauNhien = new Random();
        //return soNgauNhien.nextInt();
        
        //  tuy nhiên, cách một làm thừa một vùng nhớ cho một biến mà ta không cần dùng lại
        //  có thể dùng anonymous object (!KHÔNG ĐƯỢC NHẦM VỚI ANONYMOUR CLASS) để
        //không tốn vùng nhớ cho biến con trỏ - tức dùng tọa độ để truy cập luôn
        //sau khi chạy tọa độ sẽ bị java xóa.
        //  cách 2:
        speed = new Random().nextInt(MAX_SPEED);
        return speed;
    }

    @Override
    public String speak() {
        return "Pi, pi";
    }    

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-4d|%-10s|%-15s|%-7d|\n",
                name, nationalNumber, type, species, speed );
    }
    
}
