package main;

import data.Shelf;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        //làm menu để lựa chọn

        //biến lưu lựa chọn
        int choice;
        
        //biến lấy dữ liệu người nhập
        Scanner sc = new Scanner(System.in);

        Shelf tuSE = new Shelf("Pink", "SE");
        
        do {
            printMenu();
            
            choice = Integer.parseInt(sc.nextLine());

            System.out.println("Input your choice");
            switch (choice) {
                case 1:
                    tuSE.addStudent();
                    break;

                case 2:
                    tuSE.printStudentList();
                    break;

                case 3:
                    tuSE.searchAStudent();
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                //nếu chưa chặn người dùng nhập lựa chọn trong khoảng ở util 
                //thì sẽ làm ở đây bằng default 
                default:
                    break;
            }
        } while (choice != 6);

        //cần vòng lặp do - while cho đến khi nhập 6
    }

    public static void printMenu(){
        //MENU
        System.out.println("Welcome");
        System.out.println("Choice the following to continue:");
        System.out.println("1. Add a new student");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student");
        System.out.println("5. Remove a student");
                        //XÓA KHÔNG HẲN LÀ XÓA MÀ LÀ ẨN 
                        //ĐỂ CÒN PHỤC VỤ NHU CẦU THỐNG KÊ
        System.out.println("6. Quit");
    }    
    
    public static void checkShelf() {
        //không khai báo trong main
        //dữ liệu nằm trong đối tượng nào thì xử lý nằm cùng chỗ với đối tượng đó
        //=> package data

        //Tủ để chứa hồ sơ sv, mỗi tủ default 500 sv
        Shelf tuSE = new Shelf("Pink", "SE");
        Shelf tuGD = new Shelf("Rainbow", "GD");

        tuSE.addStudent();

    }

}
