package basicarray;

public class Sorting {

    //khi hệ thống có hai main được tạo ra, main ban đầu được gọi là main default
    //đứng ở đâu chạy nó cũng chạy main default
    //main() thứ hai uốn chạy thì bắt buộc phải mở nó lên, Shift F6
    //đổi default bằng cách vào Properties của project ==> Run ==> đổi main
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }

    public static void sortPrimitiveArray() {
        int[] arr = new int[]{8, -33, 4, 873, 4, 10};

        //in mảng trước sắp xếp
        System.out.println("The Array before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

        //sắp xếp tăng dần SELECTION SORT
        //phần tử trước phải nhỏ hơn phần tử sau
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //lấy phần tử đầu tiên đi so với tất cả các phần tử còn lại,
                
                if (arr[i] > arr[j]) {
                    //nếu LỚN hơn thì đổi
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    //NƯỚC LÊN THUYỀN LÊN
                }
            }
        }       

    }

    public static void sortStudentList(){
        //khởi tạo mảng
        Student[] arr = new Student[]{
            new Student("SE09", "bảy", 23, 3.4),
            new Student("SE04", "bảy", 10, 8.4),
            new Student("SE02", "bảy", 22, 1.4),
            new Student("SE11", "bảy", 23, 9.4)
        };
        
        //in trước sắp xếp
        System.out.println("The Array before sorting:");
        for (Student x : arr) {
            x.showProfile();
        }
        
        //sắp xếp SELECTION
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
          
               
        //in sau sắp xếp
        System.out.println("The Array after sorting:");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
