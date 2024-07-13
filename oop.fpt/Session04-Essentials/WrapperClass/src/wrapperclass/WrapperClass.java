
package wrapperclass;


public class WrapperClass {


    public static void main(String[] args) {
        //playWithIntegerPointers();
       
        playWithPool();
    }
    
    public static void playWithInterger(){
        
        int     num0 = 2003; //chỉ tốn một vùng ram 4 byte
        //Integer num1 = new Integer(2003); //từ phiên bản java 9 trở đi jdk không khuyến khích viết kiểu này nữa
        Integer num1 = Integer.valueOf("2004"); //có thể thay bằng hàm .valueOf để boxing
        Integer num2 = Integer.valueOf(2005);   //Không new vùng ram mà tạo biến object trỏ tới vùng lưu biến primitive
        Integer num3 = 2006; //Đây là cách ngầm boxing
        
        Integer num10 = new Integer(2003);
        System.out.println("new Integer: num10 = " + num10);
        System.out.println("num5 is still a pointer: " + num10.toString());
        
        //BOXING: từ biến kiểu Primitive trở thành biến kiểu Object
        //        từ int trở thành Integer
        //        hàm Integer.valueOf có kiểu trả về là Integer (hàm static)
        //UNBOXING: từ biến kiểu Object trở thành biến kiểu Primitive
        //          từ Integer tở thành int
        //          hàm tọa-độ.intValue() có kiể trả về là int
        
        int num4 = num1; //KỸ THUẬT UNBOXING, KHÔNG PHẢI ÉP KIỂU/CASTING
                         //THAM CHIẾU ĐẾN BIẾN PRIMITIVE MÀ TỌA ĐỘ OBJECT CHỈ TỚI
        
        Integer num5 = num0;  //KỸ THUẬT BOXING     
        
        //Class Integer không có hàm set(), chỉ có hàm get()
        //Integer là object read-only, không cho thay đổi value một khi đã khởi tạo
        //Class không có hàm sửa, khởi tạo xong sẽ xài value đã đổ mãi mãi, đổ 1 lần, không cho sửa
        //Nhưng hàm như thế được gọi là IMMUTABLE CLASS/OBJECT
        
        //Chỉ có 8 WRAPER CLASS (ĐỀU LÀ IMMUTABLE)
        //Byte, Short, Integer, Long, Float, Double, Boolean, 
    }
    
    public static void playWithIntegerPointers(){
        
        Integer num1 = Integer.valueOf(2003);
        Integer num2 = Integer.valueOf("2003");
        Integer num3 = 2003;
        //Ba lệnh tương đương value lõi
        //NHƯNG num1, num2, num3 trỏ tới ba vùng ram khác nhau
        
        boolean result = (num1 == num2);
        System.out.println(result); //false
                                    //Vì num1 và num2 là hai địa chỉ tọa độ ram, 
                                    //Không thể bằng nhau vì hai con trỏ trỏ tới hai vùng ram khác nhau
                                    
        //COMPARISION
        //a.compareTo(b);  //lấy a - b
                           //kết quả 1 => tương đương a > b
                           //kết quả 0 => tương đương a = b 
        //.equals();   //trả về true/false
        
        //KHÔNG SO SÁNH HAI BIẾN OBJETC < > == 
        //MÀ PHẢI . VÀO BÊN TRONG ĐỂ SO SÁNH GIÁ TRỊ LÕI
        //Ta phải viết hàm so sánh hai object vì sau này . mới lấy được value lõi để so sánh
        //Ai có info thì người đó nên xử lý: hàm so sánh là hàm của Class (không phải static)
    }
    
    public static void playWithPool() {
         Integer num1 = 2000;
         Integer num2 = 2000;
         //num1 không bằng num2
         System.out.println("does num1 equal num2: " + (num1 == num2));
         
         System.out.println("does num1 equal num2 by thiers value: " + (num1.equals(num2)));
         
         Integer num3 = 0;
         Integer num4 = 0;
         System.out.println("does num3 equal num4: " + (num3 == num4));
         
         //RIÊNG VIỆC BOXING TỪ -128 ĐẾN + 127
         //GỌI LÀ HỒ BƠI - POOL
         //Khi gói những thằng primitive/ boxing trong đoạn này thì chúng chỉ xài 1 vùng new Chung nếu Chung lõi
         //num3 bằng num4 vì nó trỏ cùng một vùng ram
         //Hiện tượng vùng nhớ POOL - CHỈ XẢY RA CHO WRAPPER, STRING, 
         //CHỈ XẢY RA HẠN CHẾ Ở MỘT SỐ TÌNH HUỐNG
         //VÀ CHỈ KHI NEW NGẦM THÌ MỚI XẢY RA
         
         Integer num5 = new Integer(100);
         Integer num6 = new Integer(100);
         System.out.println("does num5 equal num6: " + (num5 == num6));
         
         //KHI SO SÁNH HAI BIẾN OBJETC THÌ PHẢI CHẤM ĐỂ LẤY DATA BÊN TRONG MÀ SO SÁNH
         //TỨC LÀ GỌI HÀM TRONG OBJECT
         //DATA Ở ĐÂU, HÀM Ở ĐÓ, NÊN MỖI OBJECT NÊN CÓ HÀM SO SÁNH VỚI KẺ KHÁC
         //TRÊN HAI CÂU HỎI: EQUALS() VÀ COMPARETO()
    }
}
