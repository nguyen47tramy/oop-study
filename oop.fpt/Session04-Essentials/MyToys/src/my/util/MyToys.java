
package my.util;

//Đây là CLASS, khuôn, chứa, có đặc điểm/ hành động/ chứa các món đồ chơi dùng chung

import java.util.Scanner;

//cho mọi nơi - vì nó không nhớ cái gì cho riếng tư của nó
//Giống LIBRALY/FRAMWORK  - chứa các hàm/ biến (data) dùng chung cho nhiều công việc
//của các dự án khác nhau
//ví dụ muốn làm class Sinh viên thì phải làm một thư viên riêng cho nó vì không có sẵn

//Tìm hiểu về: Regular expression

public class MyToys {

    //trong này chưa các đặc điểm và hành vi, hay data và các phương thức xử lý
    // là static, chỉ có một vùng ram
    // cho người khác truy cập thoải mái nên để là public
    //(nếu không dùng public thì phải đi qua get() set()
    //mỘT CLASS bình thường thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, tùy cách thức
    //ví dụ: Math: hầu hết là static
    //nhưng String: vừa static vừa non-static
    //System hầu hết cũng static
    public static final double PI = 3.14;
    //FINAL: biến không thay đổi value, trừ lần đầu tiên khai báo
    //HẰNG SỐ
    
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTS = 500;
    
    //trong quá trình làm app, việc nhập số là gặp nhiều lần
    //ví dụ nhập 2 cạnh của hcn, nhập sự lựa chọn menu, nhập đtb,...
    //mỗi biến nhập phải kèm theo: trôi lệnh, nhập ngoài biên, nhập cà chớn
    //tách việc nhập số nguyên thành 1 hàm, gói tất tần tật vấn đề vào một hàm
    //và ta hứng kết quả trả về để sử dụng, không cần nhớ (tức không cần non-static)
    //new mà trả về kq cho ngta dùng thì không cần nhớ (không dùng nhiều ram => dùng static)
    public static int getAnInteger(){
        int n;  //biến trung gian hứng dữ liệu nhập từ bàn phím
        
        
        
        do{
            try{
                System.out.println("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
                //if nhập ngoài biên - không phải ngoại lệ
            }catch (Exception e){
                System.out.println("Please input AN INTEGER: ");
            }
        }while (true); //vòng lặp vô tận
    }
    
    //Kỹ thuật lập trình DI: Dependency Injection tăng tính linh hoạt
    //                              tb nhập, errorMsg, upperBound, lowwerBound,...
    public static int getAnInteger(String inputMsg){
        int n;  //biến trung gian hứng dữ liệu nhập từ bàn phím
        
        
        
        do{
            try{
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
                //if nhập ngoài biên - không phải ngoại lệ
            }catch (Exception e){
                System.out.println("Please input AN INTEGER: ");
            }
        }while (true); //vòng lặp vô tận
    }
    
    //đẩy Scanner ra ngoài, không phải new lại nhiều tốn ram
    private static Scanner sc = new Scanner(System.in);
    //viết lên trên cùng với biến
    //viết private để dùng nội bộ, không đưa cho bên ngoài dùng
    //khi chạy app vùng static chạy trước nên không có vấn đề gì
}
