package data;

//chữ nhật là gốc
//phát hiện HÌNH VUÔNG LÀ HÌNH CHỮ NHẬT
//SQUARE IS A VERSION OF RECTANGLE, luôn đúng (một chiều)
//==> Hình vuông có thể tham dự vào mảng chữ nhật
//==> ĐỘ LẠI KHUÔN MỚI TỪ KHUÔN CŨ
//=>> KHUÔN HÌNH VUÔNG SẼ LÀ MỘT DẠNG KHUÔN HÌNH CHỮ NHẬT
//cách tiếp cận sự tương đồng giữa các khuôn, kế thừa dùng lại
//                           INHERIT/ INHERITANCE
//viết theo cách cũ thì đó là 2 khuôn độc lập, không chung mảng
//viết theo cách kế thừa thì cùng nhà, cùng mảng
//kế thừa chỉ dành cho người nhà
//=> CLASS RECTANGLE ĐƯỢC GỌI LÀ CLASS CHA, PARENT, SUPER, BASE, PHIÊN BẢN GỐC
//=> CLASS SQUARE ĐƯỢC GỌI LÀ CLASS CON, CHILD, SUB, DERIVED
//=>> Hình vuông có tất cả mọi thứ hình chữ nhật có, không cần copy paste
//=>> Hình vuông cùng phải hành xử như hình chữ nhật

//1!!. Khi chơi với kế thừa, cần phải tôn trọng constructor gốc của con
// vuông vẫn cần phễu, nhưng lúc này phễu nó sẽ chảy thẳng lên cha
//dữ liệu của vuông chính là dữ liệu của chữ nhật

//2!!. Nhân tử chung
//3!!.

public class Square extends Rectangle{ //khai báo class square là class con của rectangle
    
    // không cần làm lại những gì hcn đã có
    // trong trường hợp này không cần khai báo thêm field, đi luôn vào constructor
    public Square(double edge, String color, String message) { //tạo phễu cho hình vuông như bình thường
                                                         //chưa cần chú ý đến việc nó là class con
        super(edge, edge, color, message); // đây là dòng DUNG HÒA CHA CON, cho chương trình hiểu
        //HÌNH VUÔNG CÓ CẠNH EDGE CHÍNH LÀ HÌNH CHỮ NHẬT CÓ CHIỀU RỘNG LÀ EDGE, CHIỀU DÀI LÀ EDGE
    }   
    //super chính là new Rectangle(....), khi new square(..) chính là nói với chương trình new rectangle(..) đi,
    //dùng số liệu nhận được khi new square(..) kìa.
    //câu này chính là đổ vật liệu lên cho cha giữ chứ bản thân mình không chứa lại những cái này
    //new Square() chính là new Rectangle(). chính là việc cắt hình vuông ở ngoài đời từ một hình chữ nhật 
    
    
    //độ lại paint()
    @Override   //Override chỉ xảy ra trong mối quan hệ kế thừa, cha con
                //class con có hàm trùng 100% tên với class cha 
                //(phế võ công của class cha, qua mặt, phủ quyết, vờ như không thấy)
                //Hiện tượng Đa hình - polymorphism
    public void paint() {
        System.out.printf("|SQUARE    |%-4.1f|  - |%15.2f|%10s|%10s|\n", 
                width, getArea(), color, message);
        
    }
    
}
