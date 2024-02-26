
package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        inputAStudent();
        saveAStudent();
    }
    
    //tách hàm, không để trong main
    public static void saveAStudent(){
        Student an = new Student("SE99", "An", 0, 0);
    }
    
    //nhập từ bàn phím
    //Cần object bàn phím Scanner
    public static void inputAStudent(){
        String id, name;
        int yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input id: ");
        id = sc.nextLine();
        
        System.out.println("Input name: ");
        name = sc.nextLine();
        
        System.out.println("Input yob: ");
        yob = sc.nextInt();
        
        System.out.println("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
}
