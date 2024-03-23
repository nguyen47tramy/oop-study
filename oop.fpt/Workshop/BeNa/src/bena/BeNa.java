
package bena;

import java.util.Scanner;
import rectangle.Rectangle;
import square.Square;

public class BeNa {

    public static void main(String[] args) {
        Square s1 = new Square(4, "red", inputMessage());
        System.out.println(s1.toString());
        
        Square s2 = new Square(5, "Blue", inputMessage());
        System.out.println(s2.toString());
        System.out.println(s1.toString());
    }
    
    public static String inputMessage(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Message: ");
                
        return scanner.nextLine();
    }
}
