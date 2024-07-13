
package data;

import java.util.ArrayList;
import java.util.List;


public class Cabinet {
    //Cái tủ để lưu trữ và quản lý các sinh viên đến nhập học 
    //Quản lý bằng ArrayList
    
    private List<Student> arr = new ArrayList();
    
    //nếu đã quy định túi có gia trị thì phễu sẽ là default , từ từ túi sẽ được add() vô
    //bằng chính hàm add()
    
    //Nếu new túi ở bên ngoài thì phễu sẽ có tham số 
    
    //Default/ empty Constructor. không làm gì cả

    public Cabinet() {
    }
    
    //Hành động của tủ là thêm, xóa, tìm, sắp xếp hồ sơ
}
