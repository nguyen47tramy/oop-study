
package data;

//lấy base từ class triangle, class derive class right triangle là class về tam giác vuông
//TAM GIÁC VUÔNG LÀ MỘT LOẠI TAM GIÁC
// đối với tam giác vuông thì chỉ cần người dùng nhập vào hai cạnh vuông a, b
// diện tích tam giác vuông = 1/2 (a x b)
public class RightTriangle extends Triangle{

    public RightTriangle(double a, double b, String color, String message) {
        super(a, b, Math.sqrt(a * a + b * b), color, message);
    }
    
    //độ lại hàm paint() của class cha chứ không tạo hàm paint mới
    @Override
    public void paint() {
        System.out.printf("|RIGTRIANGLE|%-4.1f|%-4.1f|  - |%15.2f|%10s|%10s|\n", 
                a, b, getArea(), color, message);        
    }
}
