
package studentmanagementv3;

import data.Student;
import java.util.*;

public class StudentManagementV3 {

    public static void main(String[] args) {
        //playWithArrayList();
        //sortArrayListManually();
        
        //playWithSet();
        
        
        if (getAStudent(initData(), "1234") != null) {
            System.out.println("The student is: ");
            getAStudent(initData(), "1234").showProfile();
        } else {
            System.out.println("There is no such student");
        } 
        
        
        sortStudentArrayList();
    }
    
    public static List<Student> initData(){
        List<Student> arr = new ArrayList();
                    //arr là biến local, là những biến khai báo trong hàm
                    //hết hàm thì biến local sẽ bị mất, BIẾN NẰM TRONG STACK
                    //VÙNG NEW ARRAYLIST VẦN CÒN VÌ NẰM TRONG HEAP
                    //tương đương với biến x khi foreach
        
        Student an = new Student("1234", "An", 2009, 5.9);
        Student binh = new Student("1111", "Binh", 2003, 8.0);
        //Những vùng new này sẽ không biên mất vì những vùng new này không nằm trong local
        //VÙNG NEW NẰM TRONG VÙNG NHỚ HEAP
        
        arr.add(an);
        arr.add(binh);
        arr.add(new Student("1222", "Cuong", 2003, 7.0));
        arr.add(new Student("1233", "Duong", 2002, 5.9));
        
        return arr; //NGHĨA LÀ QUY ĐỊNH arr = initData()
                    //arr đang trỏ vùng nào thì nó sẽ thảy vùng đó cho tên hàm trỏ
                    //sau khi chạy thì biến arr sẽ biến mất
                    
    }
    
    public static void playWithArrayList(){
        //Khai báo Mảng Student
        Student[] array = new Student[500];
        //array chính là một cái túi chứa 500 chỗ để đồ
        //món đồ sẽ phải mua - new, rồi bỏ vào trong túi
        //tên của mảng là biến con chỏ quản lý nhiều đồ, là tên túi
        //Mảng quản lý các con trỏ cùng kiểu, ở đây là kiểu Student
        
        //Khai báo ArrayLisst
        //Các kiểu viết - Khai ca new con()
        List<Student> arr = new ArrayList<>();
        //túi đựng đống nhất món đồ - kỹ thuật đồng nhất, generric 
        //nhét đồng nhất món đồ, dễ chấm, đa hình được
        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        
        //List arr = new ArrayList();
        //Đây là kiêu rkhai báo không genneric, không đồng bộ, có thể chứa nhiều kiểu con chỏ
        //Khó có thể đa hình
        
        //mua đồ, bỏ đồ vào túi
        arr.add(new Student("002SE", "Binh", 1999, 9.0));
        //Chỉ thảy tọa độ của vùng new, tức arr[0] = new..
        //Lưu con trỏ, new mới đồ. vùng new Student nằm bên ngoài, ở vùng Heap
        
        Student s1 = new Student("001SE", "An", 2000, 8.9);
        arr.add(s1);
        //sinh ra thêm mọt con trỏ nữa, tương đương [1]
        //add() vô tận, mảng [length - 1 ] hết mức
        
        arr.add(s1); //có thể add trùng, tức hai chàng ngăn trong túi, cùng chỏ một nàng s1
        //Khác với Set, loại giỏ chỉ lấy một, add sẽ không báo lỗi nhuwg nó chỉ lưu 1,...
        
        
        System.out.println("The Student list:");
        for (Student x : arr) {
            x.showProfile(); //không thể bị null pointer vì add đến đâu với thêm con trỏ đến đó
            // x chính bằng arr.get(i), tương đương arr[i] của mảng
        }
        //arraylist chứa bên trong nhiều đồ nhưng toàn bộ đều là con trỏ
        //add() đẩy vào một tọa độ, như vậy thì có cách get(vị trí muốn lấy)
        //trả về tọa độ con trỏ thứ i
        //trả về địa chỉ vùng new đang trỏ
        //[i] lấy được tham chiếu của bạn thứ i
        //get(i) lấy được chỗ ngồi tham chiếu con trỏ thẻ bào thứ i
        System.out.println(arr.get(0));  //data.Student@6e2c634b - trả về tọa độ vì cái túi chỉ chứa tọa độ
        //gán tọa độ qua biến con trỏ khác 
        Student x = arr.get(0);
        System.out.println(x);
        //dùng con trỏ để truy cập luôn
        arr.get(0).showProfile();
        System.out.println("The Student list, again:");
        for (int i = 0; i < arr.size(); i++) {
            //arr[i].showProfile(); --- Cách sử dụng đối với Mảng - Array
            arr.get(i).showProfile();
        }
        
        
        System.out.println("The array list has " + arr.size() + " students");
        //arr.length trong mảng thì arraylist là hàm size() trả về int
        
        
        //XÓA MỘT CON TRỎ
        //xóa một người khỏi danh sách
        // vùng new có bị mất khi chạy chương trình không tùy thuộc có bao nhiêu con trỏ đang trỏ vùng new đó
        //size() đồng thời giảm
        //set() là hàm đảo con trỏ, đảo vị trí trỏ, đó chính là hàm get và set của các object
    }

    public static void sortArrayListManually(){
        //tự sort danh sách sinh viên làm bằng tay
        //có một cơ chế không cân fdungf vòng for tự viết
        //đó là dùng hàm static Collections.sort()
        //- dùng interface
        
        //bước 1: đi mua túi - Khai Cha abstract new Con()
        List<Student> arr = new ArrayList<Student>();
        arr.add(new Student("SE123", "An", 2008, 4.6));
        
        Student binh = new Student("SE111", "Binh", 2009, 6.7);
        arr.add(binh); //trả về tọa độ vùng new
                       //có hai con trỏ cùng trỏ vào một vùng new Bình
                       //tức cùng lưu tọa độ vùng new Bình
                       
        System.out.println("The student list: ");
        for (Student x : arr) {
            x.showProfile();
            //trong arr chứa một đống con trỏ
            //x tương đương arr.get[i]
            //TỌA ĐỘ.
        }
        
        //Test đổi tọa độ
        Student temp = arr.get(0);
        //arr.get(0) = arr.get(1); //đối với arraylist thì không thể làm thế này
        //phải dùng chính hàm của arraylist để gán giá trị
        arr.set(0, arr.get(1));  //set giá trị của vị trí thứ 0 thành giá trị đang có tại vị trí 1
        arr.set(1, temp);
        
        System.out.println("The student list after swap: ");
        for (Student x : arr) {
            x.showProfile();            
        }
        
        //Test remove con trỏ
        arr.remove(0);
        System.out.println("The first pointer after removing its element");
        arr.get(0).showProfile();
        //arraylist tự động cập nhật lại vị trí sau khi remove một con trỏ
    }
    
    public static void sortStudentArrayList(){
        
        List<Student> arr = initData();
        
        
        
        System.out.println("The Student list before sorting:");
        for (Student x : arr) {
            x.showProfile();
        }
        
        System.out.println("sorting in progress...");
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()){
                    Student temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        System.out.println("done sorting!");
        
        System.out.println("The student list after sorting by GPA form lowest to highest:");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void playWithSet(){
        //một loại túi khác
        //từ lớp cha abstract SET
        //bước 1 mua túi Khai Cha new Con()
        Set<Student> arr = new HashSet();
        //Set là những loại túi không trùng lặp, một món chỉ suất hiện một lần
        //HashSet là một loại túi không trùng lặp lộn xộn
        
        //bước 2 mua đồ
        Student an = new Student("SE123", "AN", 2000, 5.7);
        
        arr.add(an);
        arr.add(an);
        
        arr.add(new Student("SE122", "Binh", 2004, 7.8));
        
        System.out.println("Thẻ student list in HashSet");
        for (Student x : arr) {
            x.showProfile();
        }
        //KHÁC ARRAYLIST LÀ VÀO TRƯỚC NGỒI TRƯỚC
        //SET SẮP XẾP ELEMENT THEO CÁCH RIÊNG CỦA NÓ, LIÊN QUAN ĐẾN COMPARABLE, COMPARATOR,..
        //sET KHÔNG CÓ HÀM GET()
        
    }
        
    public static Student getAStudent(List<Student> arr, String id){
        
        //dùng vòng for, tìm sv, có thì trả về sv, không thì trả về null
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id) ) 
                return arr.get(i);
        }
        
        for (Student x : arr) {
            if (x.getId().equalsIgnoreCase(id)) 
                return x;
            
        }
        
        return null;
    }
    
    
}
