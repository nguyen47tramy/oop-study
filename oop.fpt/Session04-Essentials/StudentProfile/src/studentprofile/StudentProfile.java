package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }
    
    public static void inputProfile(){
        //không OOP, chỉ cần hiểu về việc nhập info
        String name, address;
        int yob;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = scan.nextLine().toUpperCase();
        
        System.out.print("Input yob (and delete buffer using nextLine): ");
        yob = scan.nextInt();   //convert data từ bàn phím - từ chuỗi thành số
        scan.nextLine();        //một cách để xóa bộ đệm
        
        System.out.print("Input yob (and delete buffer using Interger): ");
        yob = Integer.parseInt(scan.nextLine());
        
        System.out.print("Input address: ");
        address = scan.nextLine().toUpperCase();
        
        System.out.println("Here is your Profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);
        
        //bị lướt lệnh sau khi nhập yob
        //hai lệnh nextLine() không bị trôi khi đứng liền nhau,
        //nhưng lệnh nextLine() bị trôi khi đứng sau lệnh nextInt()
        //Thực tế: lệnh nextLine() đứng sau có chạy
        //Lý do: buffer-bộ đệm, bị rác bàn phím để lại, 
        //nó đọc nextLine() ngay sau khi đọc hết số đã nhập ở lệnh nextInt trước
        //Chú ý là nếu không có dấu cách sau khi nhập yob thì app sẽ bị giết (exception)(data nhập vào bị sai)
        
    }
}
