
package data;
//1. Rectangle IS A SHAPE (extends Shape)

//2. Đặc điểm của con, thuộc tính dị biệt

//3. Phễu

//4. Giải quyết các hàm abstract kế thừa từ cha
//   Khi kế thừa từ một class abstract, class con cũng sẽ kế thừa (có sẵn) các hàm abstract của class cha
//   Tức mặc định, class con đã có những hàm abstract
//   Có hai cách để tiếp tục với thông tin được kế thừa
//   - Một là cho class con abstract luôn, để class con trở thành một khái niệm
//   - Hai là cụ thể hóa các hàm abstract đó - implement abstract methods
//LƯU Ý: trường hợp DÒNG HỌ VÔ SINH - trường hợp class cha - con - cháu - chắt - chút - chít đều là abstract
//trường hợp này sẽ không thể new một object từ khuôn vì khuôn đó (cha-con) là abstract
//là khái niệm, ý niệm
    
public class Rectangle extends Shape{
    protected double length, width;

    public Rectangle( String owner, String color, String borderColor, double length, double width) {
        super(owner, color, borderColor);
        this.length = length;
        this.width = width;
    }
    
    //LƯU Ý: các hàm get set dị biệt của class con, hoạt động như hàm dị biệt bình thường
    //nếu khai Cha new Con(..) thì phải thực hiện drift biến địa chỉ con trỏ thành type Con
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    
    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%-7.1f|%-7.1f|%-7.1f|\n", 
                          owner, color, borderColor, length, width, getArea());
    }
    
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
        
}
