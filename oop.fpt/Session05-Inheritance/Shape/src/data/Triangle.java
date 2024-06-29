
package data;

//class Triangle kế thừa class abstract Shape vì A triangle IS A shape

//Vì Shape là một class abstract nên khi thừa kế thì hoặc Triangle abstract, hoặc Triangle implement abstract methods

//Các bước
//1. extends
//2. thuộc tính dị biệt nếu có
//3. constractor, hàm dị biệt nếu có
//4. implement abstract methods
public class Triangle extends Shape{
    
    //thuộc tính của Triangle
    private double a, b, c; //lần lượt là các cạnh của hình tam giác

    public Triangle(String owner, String color, String borderColor, double a, double b, double c) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //hàm dị biệt get set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //implement abstract methods
    @Override
    public double getArea() {
        double p = getPerimeter() /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void paint() {
        System.out.printf("|TRIANGLE  |%-10s|%-10s|%-10s|%-7.1f|%-7.1f|%-7.1f|%-7.1f|\n", 
                          owner, color, borderColor, a, b, c, getArea());
    }
    
    
}
