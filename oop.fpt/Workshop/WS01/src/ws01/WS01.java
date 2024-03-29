package ws01;

import java.util.Scanner;

public class WS01 {
    /*
    1. Viết hàm kiểm tra xem một số có phải số nguyên tố không
    public static boolean isPrime(int n)
    2. Viết hàm in ra các số nguyên tố trong đoạn từ 1 đến 1000
    public static void printPrimeList()
    3. Viết hàm in ra 1000 số nguyên tố đầu tiên
    public static void print1000FirstPrimes()
    4. Viết hàm nhập từ bàn phím 2 hệ số a, b đại diện cho phương trình
    bậc nhất một ẩn ax + b = 0. In ra nghiệm của phương trình.
    public static void solveSimpleEquation(){
        Scanner nhapHaiHeSo = 
    }
    */ 
    public static void main(String[] args) {
        
        //System.out.println(isPrime(2));
        
        printPrimeList();
        
        //print1000FirstPrimes();
        
        //solveSimpleEquation();
    }
    
    //1
    //xem n có chia hết cho số nào từ 2 đến căn n
    //số nguyên tố nhỏ nhất là 2
    public static boolean isPrime(int n){
        int nSqrt = (int) Math.sqrt(n);
        if (n < 2) 
            return false;
        //CPU chạy đến đây là chắc chắn n >=2
        //với if, khi đã return thì không cần else vì nó đã thoát chương trình
        
        for (int i = 2; i <= nSqrt; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    
    //2
    public static void printPrimeList(){
        for (int n = 1; n <= 1000; n++) {
            if (isPrime(n)) //nguyên tắc if (điều gì đúng - true) thì làm gì
                            //=> if (isPrime(n) == true) là thừa
                            //chú ý re-use hàm ở mức cao nhất
                System.out.print(n + " ");
        }
        System.out.println("\n");
    }
    
    //3
    public static void print1000FirstPrimes(){
        int i = 0;
        int n = 1;
        while (i < 1001)
            if (isPrime(n) == true){
                System.out.print(n + " ");
                i++;
                n++;
            }
            else n++;
        System.out.println("\n");
    }
    
    //4
    public static void solveSimpleEquation(){
        double a;
        double b;
        Scanner nhapHaiHeSo = new Scanner(System.in); 
        System.out.print("Input a: ");
        a = nhapHaiHeSo.nextDouble();
        if ( a == 0 ) System.out.println("a can not be 0");
        else {
            System.out.print("Input b: ");
            b = nhapHaiHeSo.nextDouble();
            System.out.println("Equation " + a + "x + " + b + " = 0.\n x = " + (-b / a));
        }
    }
}
