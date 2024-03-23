
package rectangle;

public class Rectangle {
    private double a1, a2;
    private String color;
    private String message;

    public Rectangle(double a1, double a2, String color, String message) {
        this.a1 = a1;
        this.a2 = a2;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a1=" + a1 + ", a2=" + a2 + ", color=" + color + ", message=" + message + '}';
    }

    
    
}
