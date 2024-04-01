
package bena;

import java.util.Scanner;
import data.Rectangle;
import data.Square;

public class BeNa {

    public static void main(String[] args) {
        //Square s1 = new Square(4, "red", inputMessage());
        //System.out.println(s1.toString());
        
        playWithSquare();
        
    }
    
    public static String inputMessage(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Message: ");
                
        return scanner.nextLine();
    }

    public static void cutShape(){
        Rectangle r1 = new Rectangle(2, 4, "Red", "for Dad");
        r1.paint();
    }    
    
    public static void sortShapes(){
        Rectangle recArr[] = new Rectangle[]{
            new Rectangle(2, 4, "Red", "for Dad"),
            new Rectangle(3, 5, "Red", "for Mom"),
            new Rectangle(7, 1, "Red", "for Bingo"),
            new Square(3, "Red", "for Mom")
        };
    }
    
    public static void playWithSquare(){
        Square s1 = new Square(3, "Red", "for Mom");
        s1.paint();
        
        Rectangle r1 = new Rectangle(4.2, 3, "Black", "for Me");
        r1.paint();
        
        Rectangle s2 = new Square(4, "Yellow", "Coldplay");
        //Đây đọc là hình vuông là một hình chữ nhật
        s2.paint(); //gọi paint của lớp cha nhưng qua mặt cha, 
                    //chạy override của lớp con
        
    }
}
