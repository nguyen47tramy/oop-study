
package data;

public class Rectangle {
    //đây là lớp cha, nếu con muốn truy cập đến các thuộc tính của lớp cha 
    //thì accessmodifer phải chuyển thành protected 
    //(chia sẻ cho con nhưng vẫn giấu với người ngoài)
    protected double width;
    private double height;
    protected String color;
    protected String message;
    
    //private double area; //diện tích
    //đây là đặc tính dẫn xuất vì nó được tính toán bởi những đặc tính khác
    //==> derived atribute / field
    //khi có đặc tính dẫn xuất thì phải chú ý tính đống bộ
    //==> field consistentcy
    //==> KHÔNG ĐỔ TỪ PHỄU, KHỞI ĐỘNG area = width * length luôn
    //NHƯNG NHỚ KHI setWidth(), setHeight() PHẢI CẬP NHẬT LẠI area
    //=>> CỒNG KỀNH, TRONG KHI AREA LIÊN QUAN ĐẾN TÍNH TOÁN
    //=>> TỨC NÓ LÀ HÀM XỬ LÝ DATA

    public Rectangle(double width, double height, String color, String message) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", color=" + color + ", message=" + message + '}';
    }

    public void paint() {
        System.out.printf("|RECTANGLE |%-4.1f|%-4.1f|%15.2f|%10s|%10s|\n", 
                width, height, getArea(), color, message);
        
    }
    
    //hàm tính diện tích, hàm tính toán nên trả về để reuse
    public double getArea(){
        return width * height;
    }
}
