
package data;
//Inheritance level2: Cha trừu tượng, Con cụ thể

//Shape là lớp Cha, chú ý đặt tên khuôn tránh đặt số nhiều vì chỉ có MỘT khuôn
public abstract class Shape {
    //đặc tính chung
    protected String owner;
    protected String color;
    protected String borderColor;
    //các đặc tính dị biệt như cạnh, bán kính, ... nên để cho khuôn con giữ
    //dị biệt của ai người đó giữ.

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //Hàm bình thường nhưng giờ viết thế nào
    //public void paint(){ }
        
    
/*    
    //Vì hàm tính toán/dẫn xuất như tính diện tích, tính chu vi là hàm chung 
    //Nên hàm phải được viết ở lớp Cha để lớp Con @Override lại dùng
    public double getArea(){
        //return 1;
        //đây là một loại hàm bb return, nhưng không thể return default được
        // vì khi đó mỗi lần new một hình thì diện tích sẽ được mặc định là 1, vô nghĩa
        //vấn đề là công thức để tính ntn
        //ĐÂY CHÍNH LÀ KHAI NIỆM CỦA HÀM TRỪU TƯỢNG: 
        //Hàm tồn tại với ý nghĩa mô tả ABTRACT
    }
    
    public double getPerimeter(){
        return;
    }
*/
    //sử dụng hàm abstract như sau: -hàm chỉ nói khai niệm nhưng không có code 
    public abstract double getArea();
    public abstract double getPerimeter();
    
    //việc vẽ và in thông tin cũng chung chung với mỗi hình khác nhau
    //=> hàm paint cũng phải là abstract
    public abstract void paint();
    
}

//ABSTRACT là khái niệm, ý tưởng về một thứ gì đó
//Với hình học thì getS(), getP(), - hàm tính diện tích và chu vi, là hai khái niệm luôn phải có
//mỗi khi mô tả về hình học (HÀM PHẢI THUỘC VỀ OBJECT PHÙ HỢP)

//VÍ DỤ:
//Tivi phải có dò kênh, kết nối
//Điện thoại phải có về bắt sóng, nhận cuộc gojim gửi tin nhắn,..
//==> NHỮNG MÔ TẢ NÀY CÓ THỂ LÀ CỤ THỂ NHƯNG CŨNG CÓ THỂ CHỈ LÀ Ý TƯỞNG, KHÁI NIỆM
