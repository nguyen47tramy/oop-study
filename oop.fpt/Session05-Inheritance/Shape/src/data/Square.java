
package data;
//Khi tạo class Square thì class Square nên kế thừa ai?
//Class Square có thể kế thừa class Shape hoặc class Rectangle

//Khi kế thừa Shape, phải chú ý Shape là một class abstract, tức Square phải cụ thể tất cả các hàm abstract của class Shape 
//implement abstract class

//Khi kế thừa class Rectangle, thì rectangle là một hàm cụ thể, có đầy đủ code
//tức có thể kế thừa tất cả mà không cần phải cụ thể lại các hàm abstract
//=> Nên cho Square kế thừa Rectangle luôn (cha gần), để Shape là ông nội

//Các bước
//1. extends
//2. thuộc tính dị biệt nếu có
//3. phiễu, get set dị biệt nếu có
//4. @override hàm nếu muốn
public class Square extends Rectangle{
        
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void paint(){
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%-7.1f|  -  |%-7.1f|\n", 
                          owner, color, borderColor, width, getArea());
    }
}
