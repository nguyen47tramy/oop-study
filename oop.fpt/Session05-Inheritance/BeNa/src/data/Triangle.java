package data;

public class Triangle {
    protected double a, b, c;
    protected String color;
    protected String message;   

    public Triangle(double a, double b, double c, String color, String message) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.message = message;
    }
    
    //LƯU Ý: về việc nhập cạnh hình tam giác của người dùng
    //để kiểm soát việc nhập cạnh tam giác của người dùng nên ném ngoại lệ 
    // sử dụng class riêng 

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    //thư viện LOMBOK - giảm việc viết constructor và get set, toString()

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", color=" + color + ", message=" + message + '}';
    }
    public void paint() {
        System.out.printf("|TRIANGLE   |%-4.1f|%-4.1f|%-4.1f|%15.2f|%10s|%10s|\n", 
                a, b, c, getArea(), color, message);        
    }
    
    //hàm tính diện tích - dùng công thức hê rông: 
    //S = căn bậc hai (p x (p - a) x (p - b) x (p - c))
    // trong đó p = 1/2 chu vi 
    // => để phục vụ cho công thức này nên làm riêng hàm tính chu vi hình vuông
    public double getPerimeter(){
        return a + b + c;
    }
    public double getArea(){
        double p = getPerimeter() /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


