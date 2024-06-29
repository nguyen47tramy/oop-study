
package main;
/*
import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;
*/
import data.*;  //có thể dùng để import tất cả các class trong ngăn/file data 

public class Stage {
    
    public static void main(String[] args) {
        //playWithShape();
        
        //sortingShapes();
        
        playWithAnonymousClass();
    }
    
    public static void playWithShape(){
        //Khai Con new Con(..)
        Rectangle r1 = new Rectangle("My", "pink", "purple", 4, 5);
        //Khai Cha new Con(..)
        Shape r2 = new Rectangle("Bbi", "blue", "purple", 6, 6);
        
        Disk d1 = new Disk("My", "pink", "purple", 8);                
        Shape d2 = new Disk("Bbi", "blue", "purple", 6);
        
        r1.paint();
        r2.paint();
        d1.paint();
        d2.paint();
        
        //Khai Cha new Cha(..)??????
        //Class Cha là khái niệm/ trìu tượng/ abstract không có đầy đủ code?
        //Chưa thể new object
        
        //hÀM .PAINT() biểu thị cho tính đa hình POLYMORPHISM 
        
    }
    
    //THỰC HIỆN HÀNH ĐỘNG sorting(so sánh) bằng cách đưa các object vào cùng một mảng
    //MẢNG SHAPE(Ông nội/ông tổ/ điểm đầu của cây gia phả) 
    public static void sortingShapes(){
        //new Rectangle()
        Rectangle r1 = new Rectangle("My", "pink", "purple", 4, 5);
        Shape r2 = new Rectangle("Bbi", "blue", "purple", 6, 6);
        
        //new Square()
        Square s1 = new Square("Bbi", "blue", "purple", 4);
        Rectangle s2 = new Square("Bbi", "blue", "purple", 4);
        Shape s3 = new Square("Bbi", "blue", "purple", 4);
        
        //new Triangle()
        Triangle t1 = new Triangle("Bbi", "blue", "purple", 3, 4, 5);
        Shape t2 = new Triangle("Bbi", "blue", "purple", 6, 8, 10);
        
        //new Disk()
        Disk d1 = new Disk("Bbi", "blue", "purple", 3);
        Shape d2 = new Disk("Bbi", "blue", "purple", 3);
        
        //paint() đa hình polymophosis, có một hàm, nhưng Override đúng lúc
        //từ một hàm paint() ánh xạ/ chiếu ra N cách viết code/ implement khác nhau
        //thực thi (chạy) theo N cách khác nhau
    /*    
        //Lưu ý: Hàm của ai, chạy thế nào?
        r1.paint();  //Hàm con, chạy của con
        r2.paint();  //Hàm của cha, chạy con @overide cha không có code
        s1.paint();  //Hàm của con, chạy con
        s2.paint();  //Hàm của cha, chạy con @override, cha có code nhưng bị vượt mặt
        s3.paint();  //Hàm của ông nội, chạy cháu, ông nội không có code
        t1.paint();  //Hàm của con, chạy con
        t2.paint();  //Hàm của cha, chạy con @overide cha không có code
        d1.paint();  //Hàm của con, chạy con
        d2.paint();  //Hàm của cha, chạy con @overide cha không có code
    */    
        //Ta có các object cùng thuộc Shape,
        //có thể sort vì muốn sort thì các phần tử phải cùng kiểu
        //MẢNG SHAPE
        Shape[] box = new Shape[9]; //9 phần tử cho 9 biến Shape
        box[0] = r1;
        box[1] = r2;
        box[2] = s1;
        box[3] = s2;
       
        //Các cách khai báo mảng khác
        //Shape[] box = new Shape{new Disk(), new Rectangle, ..}
        //tương đương             box[0], box[1],..
        
        Shape[] shape = new Shape[]{r1, r2, s1, s2, s3, t1, t2, d1, d2};
        //in shape
        System.out.println("The list of shapes:");
        for (Shape x : shape) {
            x.paint();  //LỢI ÍCH VÀ Ý NGHĨA CỦA TÍNH ĐA HÌNH
        }
               
        //SORT theo tăng dần, đằng sau bé hơn thì đổi chỗ
        for (int i = 1; i < 9; i++){
            Shape temp; //đặt biến tạm chứa địa chỉ vùng nhớ của object tại vị trí i
            
            
            // dùng while
            while(( i > 0) && (shape[i].getArea() < shape[i - 1].getArea())){
                temp = shape[i - 1];
                shape[i - 1] = shape[i];
                shape[i] = temp;         
                i--;  //Lưu ý
            }
        }
        
        //in mảng đã sắp xếp
        System.out.println("The list of shapes that already sorted:");
        for (Shape x : shape) {
            x.paint();  //LỢI ÍCH VÀ Ý NGHĨA CỦA TÍNH ĐA HÌNH
        }
    }
    
    //ANONYMOUS CLASS
    public static void playWithAnonymousClass(){
        
        //Shape x = new Rectangle(..);
        
        Shape x = new Shape("self", "blue", "green") {
            @Override
            public double getArea() {
                return 50; //trả giá trị hard-code
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|NGAU NHIEN|%-10s|%-10s|%-10s|%-4.1f|\n",
                        owner, color, borderColor, getArea());
            }
        }; //; để kết thúc lệnh new
        
        //vẫn sử dụng tên biến con trỏ như bình thường 
        x.paint();
    }
}
//Nhắc lại: Tư duy lập trình
//Để tạo ra nhiều object/ đối tượng/bản thể nhanh cần một khuôn/ class - level 1
//Để tạo ra nhiều khuôn/ class nhanh cần một khuôn tổ/ abstract - level 2

//Áp dụng như thế nào cần 
//thứ nhất phải chỉ đến trong thực tế ta cần thực hiện các hành động nào(so sánh/ sắp xếp) lên các object
//thứ hai tìm điểm tương đồng, IS A a B?