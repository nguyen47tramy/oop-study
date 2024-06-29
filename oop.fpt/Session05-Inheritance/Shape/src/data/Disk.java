
package data;

//4 bước
//1. IS A (extends)
//2. Đặc tính riêng của class con
//3. Phễu/ Constructor, tôn trọng bản sắc của con
//4. implement abstract methods
public class Disk extends Shape{ //Bước 1
    
    //Bước 2
    private double radius; //bán kính hình tròn
    private  static final double PI = 3.14; 

    //Bước 3
    public Disk(String owner, String color, String borderColor, double radius) {
        super(owner, color, borderColor);
        this.radius = radius;
    }

    //Bước 3.5
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Bước 4
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|CIRCLE    |%-10s|%-10s|%-10s|%-7.1f|   -   |%-7.1f|\n", 
                          owner, color, borderColor, radius, getArea());
    }
    
    
}
