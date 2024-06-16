
package bena;

import java.util.Scanner;
import data.Rectangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;

public class BeNa {

    public static void main(String[] args) {
        //Square s1 = new Square(4, "red", inputMessage());
        //System.out.println(s1.toString());
        
        //playWithSquare();
        playWithTriangle();
        
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
    
    public static void playWithTriangle(){
        Triangle t1 = new Triangle(3, 4, 5, "pink", "hey");
        t1.paint();
        
        RightTriangle rt1 = new RightTriangle(3, 4, "pinku", "its work!");
        rt1.paint();
        
        //Khai báo Cha, new Con(..)
        Triangle rt2 = new RightTriangle(6, 8, "pinku", "its work!");
        rt2.paint();
        //tức là sao:
        //rt1 là một right triangle, khi rt1. là đang gọi paint của right triangle
        //rt2 là một triangle, khi rt2. là đang dùng danh nghĩa triangle để gọi
        //tuy nhiên vì right triangle extends triangle nên chương trình ưu tiên gọi paint của con vì new Con(..)
        //hiện tượng @Override, cha bị qua mặt
        //tính đa hình
    }
    
    
}
