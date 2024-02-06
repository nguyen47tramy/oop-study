package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        //lấy Khuôn(Class) ra để đổ info
        //lấy thông tin => tạo ra đối tượng thuộc Khuôn (Class/ Nhóm) vừa đúc
        
        //ĐẶT TÊN OBJECT ĐỂ DỄ DÀNG THAM CHIẾU ĐẾN
        Dog chiHu = new Dog("CHI HU HU", 2000, 20);
        //không nên đặt tên đối tượng là dog1 (vì vô nghĩa, khó đọc)
        //NEW  bao hàm nhiều nghĩa:
            //1st: hành động chuẩn bị tạo ra object: 
            //tham chiếu Class Dog và gọi Constructor
            //2nd: sau khi đúc xong thì được object thuộc Class Dog
            //3rd: xin vùng RAM mới đủ để chứa thông tin,
            //clone khuôn sang một vùng nhớ mới trong RAM (do đó 
            //có đến 2 vùng name dành cho object => không bị lưu đè thông tin
        
        Dog shiBa = new Dog("SHI BA", 2001, 4.9);
//biến, tên tắt: shiBa  =. object: Dog("SHI BA", 2001, 4.9)
//tương tự
    //  int yob   = 2000;
        //OBJECT CÓ HÀNH ĐỘNG (HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT thông qua dấu chấm)
        chiHu.bark();
        shiBa.bark();
        
        chiHu.name = "j";
        //access modifier public nên có thể truy cập vf thay đổi được
        //cái gì muốn dấu thì để private
        //kỹ thuật gói => ENCAPSULATION
        chiHu.bark();
        
        chiHu.setNewName("eh");
        chiHu.bark();
        
        chiHu.getYob(); //lấy thông tin                 
        System.out.println(chiHu.getYob()); //in thông tin mới lấy
    }
    
}
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG,
//tức hàm và biến phải đi kèm với nhau, đại diện, mô tả cho 1 object, thực thể
//các object khác nhau có các hành động (giống nhau) nhưng kết quả khác nhau
//ví dụ cùng .bark() nhưng chúng nó kêu khác nhau