package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        inputProfileCach2();
    }

    public static void inputProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info
        //Tổ hợp phím Alt + Shift + F dùng để căn lề code
        String name, address;
        int yob;
        Scanner scan = new Scanner(System.in);

        //Mặc định JVM J sẽ giết app nếu có cà choén xảy ra để đảm bảo an toàn cho app
        //đưa ra cơ chết tự xử khi có cà chơn, chuyển quyền giết chóc cho mình
        //=> Cần phải báo cho JVM biết đừng giết, để app tự xử lý, nhốt các lệnh cà chớn lại, đưa vào trong SANDBOX
        System.out.print("Input name: ");
        name = scan.nextLine().toUpperCase();

        try {
            //lệnh cà chớn nằm đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(scan.nextLine());
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này khi có cà chớn xảy ra
            //JVM không giết app như truyền thống
            //chỗ này là chỗ xử lý hậu quả, nếu không có cà chớn thì chuỗi lệnh này sẽ không đến lượt thực thi
            //"e" ở đây chính là message màu đỏ mà JVM gửi báo rằng có lỗi nhập dữ liệu
            //Exception e = new Exception(nội dung màu đỏ)
            //Về lý thì có thể dùng e(chấm) để xem lỗi 

            //Cách 1: Cho giá trị mặc định
            yob = 1999;

            //Cách 2: Cho người dùng nhập lại
        }

        System.out.print("Input address: ");
        address = scan.nextLine().toUpperCase();

        System.out.println("Here is your Profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);

    }

    public static void inputProfileCach2() {
        String name, address;
        int yob;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input name: ");
        name = scan.nextLine().toUpperCase();

        //Cách 2: Cho người dùng nhập lại
        while (true) { //điều kiện luôn đúng để vòng lặp vô tận. TRUE
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(scan.nextLine());
                //nếu đúng thì sẽ thoát vòng lặp ở đây
                //thoát bằng lệnh break;
                break;
            } catch (Exception e) {                
                System.out.println("Please enter again!");
            }
        }

        System.out.print("Input address: ");
        address = scan.nextLine().toUpperCase();

        System.out.println("Here is your Profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);

    }
}
