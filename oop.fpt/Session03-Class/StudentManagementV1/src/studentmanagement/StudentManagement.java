
package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        //inputAStudent();
        saveStudents();
    }
    
    //tách hàm, không để trong main
    //HARD-CODE
    public static void saveStudents(){
        Student an = new Student("SE99", "An", 2000, 0.2);
        Student binh = new Student("SE94", "Binh", 1999, 0.4);
    
        an.showProfile();
        binh.showProfile();
        
        //object(chấm) | Access Modifier/Access Specifier
        //an.name;          //biến => bão lỗi
        //an.name = "d";    //biến có gán nhưng set private => lỗi
        an.gpa = 10;        //biến đã được set public => không báo lỗi
        an.getName();       //gọi function => không lỗi (nhưng không in ra màn hình)
        an.setName("Used tobe An");    //gọi function => không lỗi
        
        an.showProfile();
        
        //để truy cập được name/biến/instance variables, ta có thể dùng get(), set()
        //có thể truy cập được nếu đặt instance variables thành public 
        //nhưng như thế sẽ bị để lộ thông tin và có thể bị sửa đổi ??
        //private mang ý nghĩ không được trực tiếp lấy và sửa đổi instance variable mà phải làm thông qua get() và set()
        System.out.println("Binh's gpa: " + binh.gpa);
        System.out.println("Binh's gpa: " + binh.getGpa());
        
        binh.gpa = 0.98;
        System.out.println("Binh's gpa: " + binh.gpa);
        System.out.println("An's gpa: " + an.gpa);
        
        //hàm không static nên mới cần biến con trỏ để đưa nó đến vùng ram lưu trữ dữ liệu
        //hàm static đã có một vùng riêng để lưu trữ => không cần/có biến con trỏ
        System.out.println("Using static");
        an.sayHi();
        Student.sayHi();
        
    }
    
    //nhập từ bàn phím
    //Cần object bàn phím Scanner
    public static void inputAStudent(){
        //private String id, name;  => bị lỗi
        String id, name;
        //static int yob;   => báo lỗi
        int yob;
        double gpa;
        //những biến này là biến local
        //public và private chì được dùng khi mô tả về một object,
        //còn nội bộ bên trong hàm tức là đã chỉ dùng trong hàm thì để private thêm là vô nghĩa
        //static cũng chỉ gắn với object
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
}
