
package data;
//Có thể làm kế thừa từ class Vehicle (abstract class vì không cụ thể)

import java.util.Random;

//Motor mua về chạy đi học là chuyện bình thường, hàm run()
//tuy nhiên khi motor gia nhập đội đua thì không dùng từ khóa extends
//XÀI TỪ LÀ 1 MEMBER CỦA - IMPLEMENTS Interface
//rồi IMPLEMENT ALL ABSTRACT METHODS CỦA CLB

//TRONG JAVA, 1 CON TỐI ĐA CHỈ CÓ THỂ KẾ THỪA 1 CHA - ĐƯỢC GỌI LÀ ĐƠN KẾ THỪA
//TRONG CÁC NGÔN NGỮ KHÁC NHƯ C#, C++ THÌ MỘT CON CÓ THỂ KẾ THỪA TỪ NHIỀU CHA - ĐA KẾ THỪA
public class Motor implements Racer {
    
    public static final double MAX_SPEED = 180;
    
    private String model; //
    private String volumn; // số phân khối
    private String vehicleIndentifierNumber;
    private double speed;

    public Motor(String model, String volumn, String vehicleIndentifierNumber) {
        this.model = model;
        this.volumn = volumn;
        this.vehicleIndentifierNumber = vehicleIndentifierNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolumn() {
        return volumn;
    }

    public void setVolumn(String volumn) {
        this.volumn = volumn;
    }

    public String getVehicleIndentifierNumber() {
        return vehicleIndentifierNumber;
    }

    public void setVehicleIndentifierNumber(String vehicleIndentifierNumber) {
        this.vehicleIndentifierNumber = vehicleIndentifierNumber;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
        
    public double run(){
        speed = new Random().nextDouble() * MAX_SPEED;
        return speed; 
    }
    
    public void showRecord(){
        System.out.printf("|MOTOR     |%-10s|%-10s|%-10s|%-8f|\n",
                model, volumn, vehicleIndentifierNumber, getSpeed());
    }

    @Override
    public double runToDead() {
        speed = run() * 3;
        return speed;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|MOTORRACER|%-10s|%-10s|%-10s|%-8f|\n",
                model, volumn, vehicleIndentifierNumber, getSpeed());
    }
}
