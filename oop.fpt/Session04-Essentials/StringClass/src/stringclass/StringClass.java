
package stringclass;


public class StringClass {

    
    public static void main(String[] args) {
        //String/ Các dòng chữ, là những object có thể
        //Mô tả đặc điểm: - gồm nhiều chữ cái
        //                - có độ dài
        //                - gồm các kí tự,...
        //Mô tả hành động:- có thể nối dòng với nhau thành một dòng
        //                - viết hoa,...
        
        //do đó ta sắp xếp chúng vào trong một class, => String Class xuất hiện
        //char[]
        
        String s1 = new String("Hello");
        String s2 = new String("Hello"); //khác với các wrapper class khi mà jdk không khuyến khích new
        
        String s3 = "Hello";
        String s4 = "Hello";
        
        String s5 = "HELLO";
        
        //So sánh con trỏ có đang trỏ cùng một vùng không
        System.out.println("s1 vs. s2 = " + (s1 == s2)); //false
        //viết tường minh new hai vùng nhớ khác nhau nên khác nhau
        
        System.out.println("s3 vs. s4 = " + (s4 == s3)); //true
        //viết ngầm ==> POOL xảy ra
        
        System.out.println("s4 vs. s5 = " + (s4 == s5)); //false
        //vẫn là POOL, nhưng POOL phân biệt hoa thường,
        //Khác hoa thường nên ở trong một vùng new khác
        //Tức biến nào new trước POOL thì cái sau mà new dữ liệu giống thì sẽ xài ké
        System.out.println("s2 vs. s3 = " + (s2 == s3)); //false
        
        //=> KHÔNG SO SÁNH HAI OBJECT QUA == MÀ PHẢI CHẤM VÀO BEN TRONG ĐỂ SORT
        //CÁC PBJETC NÊN LÀM SẴN HÀM SO SÁNH BÊN TRONG NÓ ĐỂ ĐI SO SÁNH VỚI CÁI KHÁC
        //2 LOẠI CÂU HỎI: EQUALS() VÀ COMPARETO()
    }
    
}
