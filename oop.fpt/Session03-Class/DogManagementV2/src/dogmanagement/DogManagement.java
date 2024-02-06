package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2003, 5.8);
        Dog shiBa = new Dog("SHI BA", 2001, 4.9);

        chiHu.bark();
        shiBa.bark();
        
        

        chiHu.bark();
        
        
        chiHu.bark();
        
        chiHu.getYob(); //lấy thông tin                 
        System.out.println(chiHu.getYob()); //in thông tin mới lấy
    }
    
}
