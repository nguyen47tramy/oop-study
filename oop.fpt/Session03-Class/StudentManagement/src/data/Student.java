
package data;

public class Student {
    
    private String id;   //___
    //private static String id;   //NẰM Ở MỘT VÙNG NHỚ RIÊNG MÀ OBJECT NÀO CŨNG DÙNG CHUNG
    private String name;    //____
    
    public int yob;    //___
    //public static int yob;    //VÙNG NHỚ DÙNG CHUNG
    public double gpa;  //grade point average
    //instance variables
    //có thể đặt static cho biến nhưng như thế là thiết kế sai
    //vì khi một biến được quy định là static, 
    //nó sẽ khi đè dữ liệu được tạo mới gần nhất cho toàn bộ dữ liệu của biến đấy cho mọi instance(object) được tạo trước đó ??
    //=> NÓ ĐƯỢC CLONE THÀNH MỘT BIẾN, KHÔNG PHẢI CÁC VÙNG RAM RIÊNG BIỆT NỮA
    //dữ liệu static được ăn theo object cuối cùng được new
    //giống việc 
    //int a = 10;
    //a = 100; => chỉ có một biến a lưu value => dữ liệu bị thay thế/ghi đè
    
    //KẾT LUẬN: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐẶC ĐIỂM/BIẾN/HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    //CHUNG ĐẶC ĐIỂM KHÁC VALUE THÌ PHẢI CÓ BIẾN CLONE RIỀNG - NON-STATIC
    
    //HÀM STATIC
    public static void sayHi(){
        //System.out.println("Hi everyone, my name is " + name);    => lỗi do quyền truy cập của name không phải static
        System.out.println("Hi everyone!");
        //VÌ STATIC ĐƯỢC LƯU TẠI VÙNG NHỚ RIÊNG NÊN NÓ CHỈ CÓ THỂ TRỎ ĐẾN NHỮNG BIẾN TRONG CÙNG VÙNG NHỚ ĐÓ
        //=>STATIC CHỈ ĐI ĐƯỢC VỚI STATIC (HÀM MAIN LÀ STATIC)
        //NON STATIC CHỈ THỂ ĐI ĐƯỢC VỚI STATIC VÀ NON-STATIC
        
        //hàm không static nên mới cần biến con trỏ để đưa nó đến vùng ram lưu trữ dữ liệu
        //hàm static đã có một vùng riêng để lưu trữ => không cần/có biến con trỏ
    }
    
    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }
    //hạn chế việc bị thay đổi ID

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%6d|%6.1f|\n", 
                            id, name, yob, gpa);
    }
    
    //Hàm gắn với hành động của objetc
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%6d|%6.1f|\n", 
                            id, name, yob, gpa);
    }
    
    public int grtAge(){
        return 2021 - yob;
    }
}
