package data;

import java.util.Scanner;

public class Shelf {
    
    //đặc điểm của cái tủ là gì
    private String color;
    private String label; //tên nhãn tủ
    
    //biến count để đếm sinh viên được new
    private int count = 0; 
    //không nên đưa vào phễu, biến chạy ngầm
    //count <= arr.length, không thể nhiều hơn
    
    //biến cho người dùng nhập dữ liệu
    private Scanner sc = new Scanner(System.in);
    
    //kệ/tủ chứa những món gì?
    //private Student[] arr = new Student[];
    
    //biến cần gán value, 
    //ví dụ như biến primitive thì được gán literal value 
    //objetc thì bằng new môt cái gì đó
    //Có nhiều cách gán giá trị cho object:
    //1. gán trực tiếp không qua phễu, vì phễu cũng phải đổ vào lúc nó new/clone
    //2. gán qua phễu
    
    //MẢNG ĐẶC TÍNH CẦN QUAN TÂM KHẢ NĂNG CHỨA
    //chưa nói cụ thể từng món đồ
    //==> có nhiều kỹ thuật khởi động kích thước mảng
    //1. Đổ kích thước mảng qua phễu
    //2. new luôn kích thước default khi khai báo tủ (đơn giản hơn)
    
    //==> new luôn
    private Student[] arr = new Student[200];
                            // tủ có sẵn 500 chỗ
               
    //constructor
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
        //mảng đã được cho sẵn kích thước trỏ tới 
        //nếu chưa có thì đây sẽ là nơi khởi động kích thước mảng
        //arr = new Student[size];
    }
    
    //ĐỂ HỒ SƠ VÀO TỦ NHƯ THẾ NÀO?
    //để từ từ từng phần tử new Student()
    //vì HÀM NẰM CÙNG VỚI ĐỐI TƯỢNG NÀO CÓ NHIỀU DATA
    //nên các hàm như addStudent(); deleteStudent()
    //chú ý các hàm KHÔNG ĐƯỢC STATIC
    //sẽ nằm trong class Tủ/Shelf

    //hàm addStudent()
    public void addStudent(){
        //một hồ sơ sinh viên cụ thể để lưu vào mảng
        //nhập hồ sơ từ bàn phím ==> import từ util
        //==> cần một biến count
        arr[count] = new Student(color, label, count, count);
        count++;    //giống for nhưng chậm 
                    //phải xử lý khi count = arr.length
        
        //có thể cho thêm hàm sort theo tên
    }
    
    //hàm in ra mảng sv
    public void printStudentList(){
        System.out.println("There are " + count + "/500 students");
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
    
    //hàm searchStudent()
    public void searchAStudent(){
        String id;
        
        System.out.println("Input the id you want to search");
        id = sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id))
                System.out.println("The student you looking for is:");
                arr[i].showProfile();
                return; //không có else            
        }
        
        System.out.println("Student not found");
    }  
    
    //hàm updateStudent()
    public void updateStudent(){
        //chọn sinh viên muốn update
        //dùng hàm set trong student class
    }
}
