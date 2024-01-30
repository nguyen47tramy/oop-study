package varnfunc;//NƠI LƯU PROJECT?

import java.util.Scanner;

public class VarNFunc {
    
    public static void main(String[] args) {     
        
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        
        //playWithCharacters();
        
        //playWithBooleans();
        //printIntegersList(7); //hard-code đầu vào / literal
                                //(do code cứng value, 
                                //muốn thay đổi thì phải vào code để đổi) 
                                //linh hoạt tức là hỏi-nhập: interact
                                
        int n = getAPositveInteger();
        System.out.println("Your number: " + n);
        printIntegersList(n);   //truyền tham trị (pass by value)
                                //vì n ở đây(hàm main()) 
                                //và n tham số ở hàm print.. không phải là một
                                //value từ n của hàm main sẽ được đưa qua 
                                //n của hàm print; 
                                //n của main() đập ngang sang n của hàm
        
                        //OOP thật sự là truyền tham chiếu (pass by reference)
                        //              hoặc truyền con trỏ, truyền địa chỉ
        //printIntegerList(getAPositveInteger());
    }
    
    //STATIC chỉ đi với STATIC - OOP
    public static void playWithVariables() {
        //biến là vùng ram được đặt tên, chiếm 1 số byte nhất định 
        //tùy loại dữ liệu/thông tin nó chứa
        int age = 20;
        int a, b = 100;
        System.out.println("age: " + age);
            //tự đoán age là biến và convert số 20 thành chữ 20
            // + là lệnh để ghép chuỗi
            //JAVA TỰ ĐỘNG SUY LUẬN VÀ GHÉP CHUỖI
            
        int yob = 2000; //year of birth
        age = 2020 - yob;
            //thao tác với biến thực chất là thao tác với value
        System.out.println("age again: " + age);
        
        System.out.println("age by using transitivity: " + (2020 - yob));
            //ngoặc () dùng để thay đổi độ ưu tiên
            //Java tính int trong ngoặc rồi mới chuyển kq thành chuỗi
            
        System.out.printf("age printed by using %% as in C: %d\n", (2020 - yob));
    }
    
    //Java ưu tiên int hơn long
    public static void playWithIntegers() {
        
        int n = 39; // Java dùng 4 byte = 32 bit để lưu int
            //mọi con số, ký tự trong code được gọi là literal value
            //riêng số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        //long m = 3000000000;  //tự động hiểu thành int
        long m = 3000000000L;
        long m2 = 3_000_000_000L; 
            // _ phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m); //Java dùng 8 byte = 64 bit để lưu long
        
        int status = 0xFA;  //hệ 16 decimal
                            //máy tính tự convert sang chuỗi
        System.out.println("status: " + status);
        
        //int phone = 0909; //hệ 8 octal 
                            //số 0 đứng trước được hiểu là hệ 8
                            //báo lỗi vì trong hệ 8 không dùng số 9
        int phone = 011;
        System.out.println("phone: " + phone);
    }
    
    //Java ưu tiên double hơn float
    //double lưu 8 byte = 64 bit
    //float lưu 4 byte = 32 bit
    public static void playWithDoubles() {
        
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %f\n", pi);
        System.out.printf("pi: %.2f\n", pi);
        
        //float vat = 0.1;  //vì với số thực, Java ưu tiên double(8 byte) 
                            //nên khi khai báo float có nguy cơ bị mất data
                            //(từ 8 byte xuống 4 byte)
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    
    //char = 2 byte = 16 bit, lưu Unicode(không phải ASCII)
    public static void playWithCharacters(){
        
        char m = '$';
        System.out.println("unit: " + m);
        
        //String không phải kiểu primitve mà là complex
        //Tương tự C: char name[] = "something";
        //mảng char
        String name = "Hoàng Ngọc Tú";
        System.out.println("name: " + name);
            //String là loại data type mới hoàn toàn, phức tạp
            //là object data type
        System.out.println("Name's 1st letter: " + name.charAt(0));
        
    }
    
    //booleans
    public static void playWithBooleans(){
        //đối với C: đúng quy ước là 1 hoặc > 0; sai quy ước là 0
        //lưu bằng int
        
        //đối với Java: đúng: true; sai: false
        // miêu tả trạng thái đúng sai, hình thức đúng sai
        //dùng 1 bit 
        boolean marriedStatus = true;
        if (marriedStatus == true) 
            System.out.println("1");        
        else {
            System.out.println("0");
            System.out.println("00");
        }
    }
    
    //in ra các số tự nhiên từ 1 đến 100
    public static void printIntegersList(){
        System.out.println("The list of 100 first integers: ");
        for (int i = 1; i <= 100; i++){
            System.out.print(i + " ");
        }
    }
    
    //in ra các số tự nhiên từ 1 đến n
    //Hiện tượng một class bất kỳ chứa nhiều hàm trùng tên nhưng khác tham số
    //đầu vào (khác datatype, không phải khác tên biến)
    //được gọi là OVERLOAD/OVERLOADING
    //phân biệt với OVERRIDE (thuộc tính kế thừa - INHERITATE)
    //OVERLOAD thuộc tính đa hình (POLYMORPHISM)
    public static void printIntegersList(int n){
        //body of the function
        System.out.println("The list of first " + n + " integers: ");
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println("\n");
    }
    
    //tạo hàm nhập để tăng tính linh hoạt
    public static int getAPositveInteger(){
        int n;
        //nhập từ bàn phím là dùng OOP
        Scanner banPhimCuaToi = new Scanner(System.in);
        System.out.print("Input an Positive Integer: ");
        n = banPhimCuaToi.nextInt();
        return n;
    }
}
