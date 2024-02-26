package data;

public class Dog {

    private String name;    
    private int yob;
    private double weight;
    //biến nằm trong heap vì được clone sang vùng ram mới khi dùng NEW

    public Dog(String name, int yob, double weight) {   
                                   
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  //biến nằm trong stack
                                        //mỗi khi dùng hàm
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark(){ //show ra đặc điểm lên tiếng đi kèm
                        //toString()
                        //chủ động đưa info
        System.out.println("");
    }
    
    //một object bất kỳ có info mô tả, ví dụ: xem đt ở trên tgdt thì luôn có mô tả thông số
    //khi object có info thì việc show info của một object là tự nhiên
    //đó là một hành động nên có của mỗi object (ví dụ như  bản mô tả, đặc tả về object)
    //hành động được mặc định là show tất cả info
    //hành dộng đó có thể do ta tự đưa ra 
    //hoặc tự generate theo template có sẵn mà Java có thể giúp mình

    @Override
    public String toString() {  //template của Java
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại
        //String tmpMsg = String.format("|GOGO  |%-11s|%6d|%5.1f|\n", 
        //                                name, yob, weight);
        //return tmpMsg;
        
        return String.format("|GOGO  |%-11s|%6d|%5.1f|\n", 
                                        name, yob, weight);
                
        //Có hai loại chấm, CHẤM CẦN NEW mới có và CHẤM KHÔNG CẦN NEW
        //CHẤM KHÔNG CẦN NEW là loại chấm liên quan đến STATIC
    }
    
    //OVERLOAD: hiện tượng trong một class có nhiều method cùng tên nhưng khác 
    //loại tham số truyền vào trên kiểu dữ liệu
    //KHÁC VỚI OVERRIDE - (cả hai đều liên quan đến khái niệm POLYMORPHISM - TÍNH ĐA HÌNH)
    
    
    //GIẢI THÍCH VIỆC: HÀM NÀO CÓ NHIỀU THÔNG TIN NHẤT THÌ HÀM ĐÓ NÊN TỰ XỬ LÝ THÔNG TIN
    //nếu có data thì nên xử lý thông tin luôn - nguyên tác ENCAPSULATION
    //đặc điểm của hành động đi kèm với thông tin trong object
    //Hàm gắn với việc xử lý thông tin của chính object
    public int getAge(){
        return 2021 - yob;
    }
    //viết ntn là hard-code, fix value, năm sau phải sửa lại code
    //Nên lấy giờ hệ thông trong Windows - yob
    
}
