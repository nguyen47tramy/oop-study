
package circle;

public class Circle {
    private double r; //radius
    private String color;
    private String message;

    public Circle(double r, String color, String message) {
        this.r = r;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + ", color=" + color + ", message=" + message + '}';
    }

    
    
}
