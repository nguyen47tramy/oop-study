
package main;

import data.Student;

public class Stage {
    public static void main(String[] args) {
        
        Student ahihi = checkObjectV8();
        //ahihi lưu tọa độ của vùng An trong hàm do được thảy ra ngoài qua tên hàm
        ahihi.showProfile();
    }    
    
    public static void checkObjectV1() {
        Student s1 = new Student("SE99", "An", 2000, 0.2);
            //reference var     //object, vùng ram bự trong Heap
            //object var        //instance, một hiện thân
            //"pointer" var
        
        s1.showProfile();
        
        
        
        //s1 là biến nên nó có thể thay đổi value
        //thay đổi tham chiếu đến cùng ram khác
        Student x = s1; //hai con trỏ cùng trỏ một vùng ram
        s1 = new Student("SE3555", "Binh Le", 1999, 0.7);
        
        s1.showProfile();
        
        x.showProfile();
        //nếu không có x, An không còn ai trỏ, KHÔNG CÁCH NÀO LẤY LẠI ĐƯỢC VÙNG RAM NÀY
        //TỌA ĐỘ NEW CŨ KHÔNG GIỮ LẠI
        
        //biến object là tay cầm con diều, new chính là con diều
        //JVM có một chương trình ngầm quét những vùng new nào bị mất con trỏ
        //gọi là CTy MTĐT - GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW KHÔNG CÓ CON TRỎ 
        //ĐỂ FREE, TRẢ LẠI RAM CHO NHỮNG LỆNH NEW SAU NÀY
        
        //Đặt vấn đề: 
        new Student ("SE67648", "Dai Gia", 2001, 9.9).showProfile();
    }
    
    public static void checkObjectV2(){
        Student s1 = new Student("SE99", "An", 2000, 0.2);
        Student s2 = new Student("SE99", "An", 2000, 0.2);
        //mỗi lần new là một lần clone
        
    }
    
    public static void checkObjectV3(){
        Student s1 = new Student("SE99", "An", 2000, 0.2);
        s1 = new Student("SE98", "Minh", 2001, 0.2);
        //mất tọa độ vùng clone An => gọi là vùng ram mồ côi (không có ai trỏ tới)
        //định kì khi chạy app, phần chạy song song với window - jvm sex kiểm soát app
        //nó sẽ clear vùng ram mà không có có con trỏ
        //gọi vui cty Môi trường đô thị (jvm có đoạn code, module giám sát HEAP, xem vùng nào không có con trỏ)
        //gọi đúng là Garbage Collector
        System.gc();
    }
    
    public static void checkObjectV4(){
        Student s1 = new Student("SE99", "An", 2000, 0.2);
        Student x = s1;     //kỹ thuật backup tọa độ new vào một biến khác
        s1 = new Student("SE99", "An", 2000, 0.2);
        
        x.showProfile();
        s1.showProfile();        
        
    }
    
    public static void checkObjectV5(){
        Student s1 = new Student("SE99", "An", 2000, 0.2);
        Student x = s1;
        //hai vùng ram biến con trỏ cùng trỏ về một vùng new
        
        s1.showProfile();
        x.showProfile();
        
        //chứng minh cùng trỏ một cùng new
        s1.setName("Set name");
        
        System.out.println("After set name:");
        s1.showProfile();
        x.showProfile();
        //OOP là lập trình về tọa độ
        //nhiều tên cùng tham chiếu 1 object
        //cùng một tên ám chỉ nhều object khác (thay đổi value của biến)        
        
    }
    
    public static void checkObjectV6(){
        
        //câu chuyện của sinh ra rồi chết non
        //câu chuyện vô danh tên gọi
        //object không thèm, không có tên gọi, vẫn hành xử được
        
        Student s1 = new Student("SE99", "An", 2000, 0.2);
        //vùng new này đã tương đương tọa độ
            //thảy cho biến object nào đó giữ dùng
            //biến đó mà chấm là đọa độ chấm
        //vì biến có tọa độ từ new => NEW NẮM TỌA ĐỘ
        //CHẤM là vào trong tọa độ
       
        new Student("SE99", "An", 2000, 0.2).showProfile();
        //không thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
        //object vô danh, ANONYMOUS OBJECT, object was created without a name, a reference
        //xuất hiện xong, gáy xong, garbage collector phát hiện không có con trỏ trỏ vào vùng này
        //gc sẽ clwar nó.
        //=> không re use được, muốn reuse thì gán cho nó vào một biến con trỏ để chấm
        
        
    }
    
    public static void checkObjectV7(){
        
        Student x;  //khai báo con trỏ nhưng chưa trỏ ai
        
        x = new Student("SE99", "An", 2000, 0.2);
             
        
    }
    
    //Hàm trả về một object
    //Chuẩn: Hàm trả về 1 tọa độ của object nào đó, vì có tọa độ nghĩa là sờ được object
    //có tọa độ CHẤM là tới object
    
    //Tương đương Student x;
    public static Student checkObjectV8(){  // tương đương = một vùng new
        
        Student x;  //khai báo con trỏ nhưng chưa trỏ ai
        
        x = new Student("SE99", "An", 2000, 0.2);
             
        return x;
        //x đang lưu tọa độ vùng clone cho An và thảy tọa độ đó cho tên hàm
        //lúc nàu tên hàm là tọa độ new 
        //vẫn là một vùng new được trỏ bởi nhiều con trỏ
        
        //x là biến local, sẽ bị clear khi hàm chạy xong
        //biến x sẽ mất, nhưng vùng new nằm trên HEAP sẽ không bị mất
        //return new Student();
    }
}
