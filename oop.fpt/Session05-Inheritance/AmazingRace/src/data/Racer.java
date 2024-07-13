
package data;

//gom nhóm lỏng lẻo, cùng nhóm có hành động chạy, CLB đua
//CLB chỉ quan tâm đến hành động, trong CLB/ Interface sẽ chỉ chứa hành động
//CLB chỉ chỉ định hành đọng, còn làm thế nào thì ở tự mỗi người 
//INTERFACE CHỨA HÀM ABSTRACT (NHỮNG PHIÊN BẢN JDK SAU, SAU JDK 8, CHO PHÉP CÓ HÀM CÓ CODE NHƯNG

public interface Racer {
    //phải đua
    //public abstract double runToDead(); //không cần từ abstract
    public double runToDead();
    public void showHowToDead();
    public double getSpeed();
}
