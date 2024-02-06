package data;

public class Dog {
    //Trong khuôn chứa các info qua biến = value
    //giống phôi CCCD/Form
    //Chừa chỗ bên trong để fill value vào
    public String name;    //đặc điểm được liệt kê để chừa chỗ cho value đổ vào
    private int yob;
    private double weight;
    //đây được gọi là biến toàn cục
    //biến nằm ngoài hàm và các hàm lấy biến đó để xử lý
    //đặc biệt: các biến này phải được đổ(quy định) value 
    //thông qua các phễu(constructor) rồi mới được đem đi dùng 
    //để hoàn thành cái object đích thực
    
    
    //một cái khuôn cần có cái phễu để hứng vật liệu vào 
    //hàm hởi tạo, constructor,hàm đúc, hàm tạo dựng
    //đúc ra object vì thông qua nó, vật liệu chảy vào trong khuôn
    //CONSTRUCTOR hay PHỄU là hàm đặc biệt, vì nó dùng để tạo ra object
    //cứ mỗi lần dùng (gọi) là có một object mới
    //Hàm không có giá trị trả về(không void) vì bản chất 
    //nó trả về nguyên cả object (bức tượng đang đúc)
    //Tên của Constructor phải giống với tên khuôn (Class)
    public Dog(String iName, int iYob, double iWeight){   //đây là phễu
        name = iName;        
        yob = iYob;
        weight = iWeight;
    }
    
    //viết các hàm xử lý data
    //ví dụ viết hàm giao tiếp hỏi năm sinh
    //đối với object, gọi là hành động, behaviour
    public void bark(){
        System.out.println("wof wof my name is " + name);
        System.out.printf("|%-10s|%5d|%5.1f|\n", name, yob, weight);
    }
    
    //vì mặc định thông tin là sẽ giấu, khi mình giao tiếp mình mới bật nó
    //chia sẻ info khi được hỏi:
    //Hàm get-thông-tin()
    public int getYob(){
        return yob;
    }
    
    //thay đổi thông tin luc new / đúc ra đối tượng
    //hàm bình thường, không phải constructor
    //Hàm set-thông-tin()
    public void setNewName(String newName){
        name = newName;
    }
    
    //getter - setter là cách để bảo đảm 
    //tính toàn vẹn của dữ liệu (data intergrity), 
    //tính không bị hiệu chỉnh của dữ liệu
    
}
