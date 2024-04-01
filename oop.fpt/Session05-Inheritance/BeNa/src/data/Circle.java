
package data;

public class Circle {
    private double radius;
    private String color;
    private String message;

    public Circle(double radius, String color, String message) {
        this.radius = radius;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", message=" + message + '}';
    }

    public void paint() {
        System.out.printf("|CIRCLE   |%-15s|%15.2f|%10s|%4.1f| -- |\n", 
                radius, getArea(), color, message);
        
    }

    //hàm tính diện tích, hàm tính toán nên trả về để reuse
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
        //return width * height;
    }
    
}
