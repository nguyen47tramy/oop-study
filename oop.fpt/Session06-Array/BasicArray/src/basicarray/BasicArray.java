package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArrayV3();
        sortObjectArray();
    }

    public static void playWithPrimitiveArray() {
        //float vol[365];   //Java cấm khai báo kích thước của mảng trong ngoặc vuông

        float vol[];
        //vol[] = {0, 0, 9, 8, 8};
        float vol1[] = {0, 0, 9, 8, 8};
        //khác với mảng tĩnh (static array) trong C nằm trong stack, bị động trong việc cấp phát
        //mảng động của Java nằm trôi nỗi trên heap

        //coi mảng là một tập hợp các value
        //với mọi x thuộc N, x là bất kỳ phần tử nào trong N
        //VỚI MỌI LÀ KỸ THUẬT QUÉT QUA MẢNG
        //KỸ THUẬT DÙNG MỘT CON SỐ TỰ NHIÊN ĐỂ DUYỆT QUA CÁC PHẦN TỬ TRONG MẢNG
        //FOREACH
        System.out.println("The array há the value of (using for each)");

        for (float x : vol1) {
            //x = lần lượt các giá trị
            // x bằng từng ptu lẻ trong mảng sỉ
            System.out.println(x);

        }

    }

    public static void playWithPrimitiveArrayV2() {
        //bên C
        //float* arr    =   calloc(7, sizeof(float));
        //biến con trỏ      vùng new Object()
        //biến tham chiếu   vùng new Object()

        //tương tự muốn khai báo có số lượng phần tử sẵn trong java
        double arr[] = new double[365];
        //default double gán hết bằng 0.0
        //KHÁC NEW () LÀ PHỄU ĐỂ ĐÚC OBJECT

        System.out.println("The array has the values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("The array has the values of (for each)");
        for (double x : arr) {
            System.out.println(x);
        }

        //LƯU Ý:
        //arr[0] là biến primitive => không có tham chiếu đến cái gì hết, dùng đơn bình thường
        //arr.length
        //DÙ LÀ MẢNG GÌ THÌ TÊN MẢNG CŨNG LÀ BIẾN CON TRỎ, BIẾN OBJECT
        //SẼ TRỎ VÙNG RAM QUA NEW, KHÔNG ĐUC TRUYỀN THỐNG MÀ LÀ ĐÚC VÙNG RAM NHIỀU BIẾN
    }

    public static void playWithPrimitiveArrayV3() {
        //học lại cách khai báo mảng
        int arr1[] = {2, 10, 25, 20};   //new ngầm, không nói rõ new nhwung thực ra có
        int arr2[] = new int[4];
        int arr3[] = new int[]{2, 10, 23, 30};
        //cách 1 tương đương cách 3 

        int arr[];  //nói rằng có nhiều biến
        arr = new int[4];   //cuối cùng vẫn phải new
        //có nhiều biến trùng tên rồi thì sau đó sài từng biến theo yêu cầu
        arr[0] = 5;
        arr[1] = 10;
        //phần còn lại không gán thì default int = 0

        //ARR LÀ GÌ: là biến đặc biệt, là biến object 
        //vì trỏ một vùng new bự => có quyền chấm (.)
        //ví dụ .toString()
        System.out.println(arr.toString()); //convert các biến thành mã Hexa
        //get set không có, thay vào đó được chơi trực tiếp qua []
        //arr[0] tương đương arr.get(thằng thứ 0)
        //arr.length => length function là non-static, là hằng số đặc biệt ăn theo từng mảng
        //              vì bản thân mỗi mảng khác nhau về kích thước

        //in mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //LƯU Ý: KHÔNG NHẦM LẪN MẢNG VÀ PHẦN TỬ CỦA MẢNG

        for (int i : arr) {
            System.out.println(i);
        }
        //KHAI BÁO MẢNG LÀ KHAI BÁO BIẾN, BIẾN TÊN MẢNG LÀ BIẾN CON TRỎ
    }

    public static void playWithStudentObject() {
        Student x = new Student("SE123", "An", 1999, 4.6);
        x.showProfile();
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ 10 sinh viên
        //10 biến + 10 new() 
        //lưu 10 số tự nhiên => 10 biến + 10 value 
        int arr[] = new int[10];

        //khai báo lẻ biến sinh viên
        Student s1, s2, s3, s4, s5, s6, s7, s8;
        Student sa1[] = new Student[]{};
        Student sa2[] = new Student[10];
        //Lưu ý hai loại ngoặc tròn(gọi phễu 1 object) và vuông

        //s1.setName("đ");
        //tiếp cận được đặc tính nhưng chưa new nên chưa có dữ liệu để thao tác
        //sa2[0].setName("");
        //tương tự
        //sa2.length;
        //sa2 là biến má mì, biến con trỏ quản lý mảng sinh viên
        //[] dành cho nhiều biến, nhiều tên gọi tắt
        sa2[0] = new Student("SE123", "An", 1999, 4.6);
        sa2[1] = new Student("SE124", "Bin", 1999, 4.6);
        sa2[1].getName().toLowerCase();

        //phần còn lại chưa innitialize
        //từ sa2[3],...sa2[9] là DEFAULT BẰNG 0
        //                    TỨC TRỎ VÀO TỌA ĐỘ 0 CỦA RAM
        //                    BYTE ĐẦU TIÊN TRONG RAM, 0000 0000
        //tức là byte đầu tiên (byte thứ 0, tọa độ thứ 0) của ram toàn số 0
        //còn được gọi là byte NULL, KHÔNG GÌ CẢ
        //IN MẢNG chứng minh
        System.out.println("The list:");
        for (int i = 0; i < sa2.length; i++) {
            sa2[i].showProfile();
        }
        //khi chạy đến những phần tử chưa trỏ tới vùng new() - trỏ tọa độ 0
        //sẽ bị exception và giết app
        //NullPointerException

        //LƯU Ý: KHI CHƠI VỚI MẢNG, CON TRỎ MẶC ĐỊNH SẼ LÀ NULL, TRỎ VỀ ĐÁY RAM
        s1 = null;  //trỏ đáy ram
        //có value là số 0, tọa độ 0 ở đáy ram, đi vào 0000 0000
        s1.showProfile();   //NullPoiterExeption

        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI CÓ BIẾN COUNT ĐỂ CHO BIẾT MẢNG ĐÃ ĐẦY CHƯA
        //ĐỂ GÁN VALUE ĐẾN ĐÂU THÌ FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGTH
    }

    public static void sortObjectArray() {
        //Student[] arr = new Student[]; //hai cách khai báo giống nhau
        Student arr[] = new Student[2];
        arr[0] = new Student("SE888", "An", 2000, 9.0);
        arr[1] = new Student("SE800", "Binh", 2000, 5.0);

        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0];   x = arr[1]; //2 con trỏ cùng trỏ vào một vùng ram
            x.showProfile();
        }

        //sắp mảng tăng dầm theo điểm trung bình
        //sau khi sắp xong, bạn [0] sẽ phải có điểm 5
        //                  bạn [1] sẽ phải có điểm 9
        //==> đổi chỗ contrỏ
        //SWAP
        Student temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("The student listafter sorting");
        for (Student x : arr) {
            //x = arr[0];   x = arr[1]; //2 con trỏ cùng trỏ vào một vùng ram
            x.showProfile();
        }
        //ĐỔI CÁCH TRỎ [i] TRONG MẢNG

        //SELECTION SORT (NƯỚC LÊN THUYỀN LÊN)
        //chỉ đổi khi bị lộn xộn,
        //nếu đứng tước mà lớn hơn về value thì phải đổi value
    }

    public static void sortObjectArrayV2() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE888", "An", 2000, 9.0);
        arr[1] = new Student("SE800", "Binh", 2000, 5.0);

        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0];   x = arr[1]; //2 con trỏ cùng trỏ vào một vùng ram
            x.showProfile();
        }

        
        //TUYỆT ĐỐI KHÔNG DÙNG TOÁN TỬ SO SÁNH CHO CÁC BIẾN OBJECT
        //VÌ SO SÁNH TỌA ĐỘ, ĐỊA CHỈ LÀ VÔ NGHĨA
        //chỉ có thể so sánh value tại địa chỉ đó
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        //CHÚ Ý KHÔNG ĐỔI ĐIỂM
        System.out.println("The student list after sorting");
        for (Student x : arr) {
            //x = arr[0];   x = arr[1]; //2 con trỏ cùng trỏ vào một vùng ram
            x.showProfile();
        }

    }
}
