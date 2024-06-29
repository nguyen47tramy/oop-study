
package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    public static void main(String[] args) {
        playWithParent();
    }
    
    public static void playWithParent(){
        //Khai báo Cha; new Cha(..)
        Parent p = new Parent("House", "Restaurant");
        p.showProfile();
        
        //Khai báo Con; new Con(..)
        Child c1 = new Child("wife", "bed", "onlyfans");
        c1.showProfile();
        c1.sayHi();
        //xổ tất phần của Con vì dùng danh nghĩa Con, loại datatype của biến con trỏ là Con
        
        //Khai báo Cha; new COn(..)
        Parent c2 = new Child("wife", "bed", "onlyfans");
        c2.showProfile();
        //c2.sayHi(); -> lỗi do BIẾN DỊ 2
        //biến con trỏ c2 không chỉ xuống hết đáy ram của Con mà chỉ trỏ hết Cha
        //vậy nên biến con trỏ không chạm tới vùng sayHi(), mặc dù sayHi() vẫn tổn tại trong ram
        
        //ĐỂ GIẢI QUYẾT BIẾN DỊ 2: SỬ DỤNG KỸ THUẬT TỔ LÁI CON TRỎ DRIFT
        //kéo giãn con trỏ Cha xuống đến đáy vùng new Con(..)
        //cần con trỏ tạm để lấy được cái đáy new Con(..)
        Child x = (Child)c2; //ép kiểu cho biến con trỏ
        
        //hoặc không dùng con trỏ tạm
        ((Child)c2).sayHi();
        
    }
}
