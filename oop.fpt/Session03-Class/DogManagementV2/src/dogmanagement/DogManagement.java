package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2003, 5.8);
        Dog shiBa = new Dog("SHI BA", 2001, 4.9);

        //chiHu.bark();
        //shiBa.bark();        
             
        chiHu.getYob(); //lấy thông tin                 
        System.out.println(chiHu.getYob()); //in thông tin mới lấy
        
        System.out.println(chiHu.toString());
        System.out.println();
        
        //hàm toString() là một hàm đặc biệt vì nó gắn với @Override
        //mục tiêu là show là all info đã được đổ hoặc đã được chỉnh sửa
        //tương đương việc ở Setting trong điện thoại để xem cấu hình (info đt)
        
        System.out.println("Play with toString() - Gọi ngầm");
        System.out.println(chiHu);  //chiHu là biến con trỏ
                                    //theo lý sẽ phải in ra địa chỉ toạn độ của 
                                    //object chiHu (vùng new) được lưu trên vùng nhớ heap
                                    //tuy nhiên ở trong Java thì nó gọi ngầm toString()
        
        //khi không @Override toString() mà dùng toString() được viết của Java
        //thì nó trả về chính vùng nhớ trong ram        
        //máy ảo java - JVM sẽ tự động băm cái vùng ram của object 
        //thành con số hexa đại diện cho vùng ram đó
        //liên quan đến HASH NUMBER, KỸ THUẬT NÉN TOÀN BỘ DATA THÀNH MỘT CON SỐ,..
        System.out.println(chiHu.toString());   
        System.out.println(shiBa);             
          
        
        //TƯƠNG TÁC VỚI OBJECT
        //xem tuổi của 1 object, tương tác với object qua dấu chấm
        System.out.println("Age: " + chiHu.getAge());
    }
    
}
