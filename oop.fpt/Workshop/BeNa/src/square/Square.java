
package square;

public class Square {
    private double a;
    private String color;
    private String message;

    public Square(double a, String color, String message) {
        this.a = a;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Square{" + "a=" + a + ", color=" + color + ", message=" + message + '}';
    }
    
    
    
    
}
