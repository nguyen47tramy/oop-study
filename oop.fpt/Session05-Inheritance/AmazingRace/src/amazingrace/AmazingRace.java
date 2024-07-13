
package amazingrace;

import data.*;
import java.util.Random;

public class AmazingRace {


    public static void main(String[] args) {
        //runToDead();
        
        runToDeadAnonymours();
    }
    
    public static void runToDead(){
        Motor m1 = new Motor("Exiter", "175 cm3", "333-5456");
        //m1.runToDead();
        m1.showHowToDead();
        Racer m2 = new Motor("Winner", "150 cm3", "C33-7788");
        m2.showHowToDead();
        
        Pet c1 = new Cat("Meow", 1900, 7.8);
        Cat c2 = new Cat("Kitty", 1980, 3.4);
        c1.showHowToDead();
        c2.showHowToDead();
        
        Pet d1 = new Dog("Chihuahua", 1999, 1.3);
        Racer d2 = new Dog("Bull", 2015, 5.7);
        d1.showRecord();
        d2.showHowToDead(); //chỉ xổ ra những phần của Interface Racer, không xổ ra run() 
                            //vì biến con trỏ chỉ trỏ đến đáy ram vùng clone Racer 
                            
        //MẢNG RACER!!!!
        //Vì Pet đang implements Racer
        //Con nếu Pet không implements Racer, chỉ có Dog, Cat implements Racer 
        //thì phải ép kiểu nếu khai Pet new Dog(..)/Khai Pet new Cat(..)
        //
        Racer[] racer = {m1, m2, c1, c2, d1, d2};
                
        System.out.println("The racing record:");
        for (Racer x : racer) {
            x.runToDead();
            x.showHowToDead();
        }
        System.out.println(racer[0].getSpeed());
        for (int i = 1; i < racer.length; i++){
            while (i > 0 && racer[i].getSpeed() < racer[i - 1].getSpeed()){
                Racer temp = racer[i - 1];
                racer[i - 1] = racer[i];
                racer[i] = temp;
                i--;
            }
        }
        System.out.println("The racing record from slowest to fastest:");
        for (Racer x : racer) {
            x.showHowToDead();
        }
    }
    
    public static void runToDeadAnonymours(){
        //ví dụ lại về mảng
        Motor m1 = new Motor("Exiter", "175 cm3", "333-5456");
        Racer m2 = new Motor("Winner", "150 cm3", "C33-7788");
        
        Pet c1 = new Cat("Meow", 1900, 7.8);
        Cat c2 = new Cat("Kitty", 1980, 3.4);
                     
        //ví dụ ta có một người cá - mermaid - đặc biệt
        //Không thích ăn và hoạt động như những người cá khác
        //Người cá đặc biệt muốn tham gia đua.
        //Ta không thể làm một class  Mermaid concreate rồi bắt cả họ nhà người cá
        //đối tượng nào sinh ra là người cá cũng phải đi đua (tốn vùng ram lưu trữ một cách không cần thiết)
        //==> Giải quyết bằng Anonymous Class, không tạo class rời, mà vẫn tham gia CLB
        //cần có hành động của CLB, vẫn phải implements all abstract methods =>> on the go / take away
        
        //TA LÀM CLASS RIÊNG ĐỂ NHÂN BẢN NHIỀU MEMBER
        //TA LÀM ON THE GO CÓ CÁC VÃNG LAI GHÉ NGANG
        //CẢ HAI ĐỀU PHẢI IMPLEMENTS @OVERRIDE VÌ CHA/CLB KHÔNG HOÀN HẢO/ CHỈ NÓI Ý TƯỜNG MÀ KHÔNG CÓ CODE CỤ THỂ
        //NGUYÊN TẮC CỦA LẬP TRÌNH LÀ PHẢI CÓ ĐẦY ĐỦ CODE ĐỂ HÀNH XỬ
        //MƯỢN GIÓ BẺ MĂNG
        Racer mermaid = new Racer() {
            //Đây là vùng không gian của class mermaid mà ta làm biếng làm riêng
            //Vùng này chính là phần mwor rộng của CHa/CLB
            //Ba sẽ là cánh chim (new/super() new Racer ngầm)
            //đưa con extends/implements đi thật xa thật nhiều @Override
            //Ta có thể làm như truyền thống, thêm đặc điểm/fields/..
            //Nhưng không nên lạm dụng anonymours class/ on the go vì không thể tái sử dụng
            public static final double MAX_SPEED = 50.0;
            private double speed;
            
            @Override
            public double runToDead() {
                speed = new Random().nextDouble() * MAX_SPEED *3;
                return speed;
            }

            @Override
            public void showHowToDead() {
                System.out.printf("|MOTORRACER|Mermaid   |1999      |     -   -|%-8f|\n",
                getSpeed());
            }

            @Override
            public double getSpeed() {
                return speed;
            }
        };
        
        Racer[] racer = {m1, m2, c1, c2, mermaid};
        System.out.println("The racing record:");
        for (Racer x : racer) {
            x.runToDead();
            x.showHowToDead();
        }
        
        
        for (int i = 1; i < racer.length; i++){
            while (i > 0 && racer[i].getSpeed() < racer[i - 1].getSpeed()){
                Racer temp = racer[i - 1];
                racer[i - 1] = racer[i];
                racer[i] = temp;
                i--;
            }
        }
        
        System.out.println("The racing record from slowest to fastest:");
        for (Racer x : racer) {
            x.showHowToDead();
        }
    }
}
