
package pokemondemo;
//ĐẶT BÀI TOÁN: Có ba loài main là Pichu, Pikachu và Raichu. 
//Lưu thông tin những con main này kiểu gì?

import data.*;


//Nếu muốn sort dựa trên tốc độ chạy thì như thế nào.

//Phân tích:
//Pikachu là tiến hóa của Pika, tức là một loài khác, không thể Pika IS A Kind of Pikachu
//=> "Pikachu IS A Kind of main" là hợp lý, một chiều, tương tự với hai loài kia.
//Để sort theo tốc độ thì tất cả phải chung một data type
//=> Thiết lập class Cha main
//Chạy là hành động =>methods
//Vì tất cả các pokemon đều có hành động này => nên sử dụng abstract để mỗi con chạy riêng
//Mỗi pokemon đều có tốc độ chạy tối đa => nên random(range) mỗi khi new một pokemon mới

//!!! pokemon rất rộng, có nên đưa về electric type pokemon không?
//!!  Loài pokemon có hai type thì sắp xếp kiểu gì? class tổ chức như thế nào?
//!!! có nên đưa về class species pokemon. ví dụ Pichu, Pikachu, Raichu Are A KIND OF MOUSE POKEMON
//!!  Không vì mouse dường như là đặc tính, nó không có điểm khác biệt (dị biệt) dùng để phân chia pokemon
//!!! 

//Phân loại ví dụ như sau:
//Quagsire, ..                 
//Pich, Raichu,..                      - Pokemon           
//Graifaiai,...                
//                                                                          - Creture
//                                     - Tree
//                                     


//MANH MỐI ĐỂ PHÂN LOẠI ASBTRACT 
//Khi nói về object đó mã nó rõ, cụ thể luôn thì không phải là abstract
//Khi nói về một object mà cần phải giải thích thêm -> abstract
//ví dụ: Ê pokemon chuột trông dễ thương nhở -- m đang nối đến con nào? ==> abstract
// chuột điện ý -> pichu hay pikachu? --chưa cụ thể abstract
// chuột điện cấp hai -> à pikachu! -- cụ thể không abstract
public class main {

    public static void main(String[] args) {
        test();
    }
    
    public static void test(){
        
        Pokemon pasture[] = new Pokemon[] {
                        new Pichu("Pichu", 98, "Electric", "Tiny Mouse Pokemon", 0.3, true),
                        new Pichu("Pichu", 98, "Electric", "Tiny Mouse Pokemon", 0.3, false),
                        new Pikachu("Pikachu", 99, "Electric", "Mouse Pokemon", 0.6, true),
                        new Pikachu("Pikachu", 99, "Electric", "Mouse Pokemon", 0.66, true),
                        new Raichu("Raichu", 100, "Electric", "Mouse Pokemon", 0.44, true),
                        new Raichu("Raichu", 100, "Electric", "Mouse Pokemon", 0.54, true)
                        };
        
        //let get them run
        for (Pokemon x : pasture) {
            x.run();
        }
        //System.out.println(pasture[0].run());
        //System.out.println(((Pichu)pasture[0]).getSpeed());
        
        System.out.println("Your pasture record:");
        for (Pokemon x : pasture) {
            x.showRecord();
        }
        //(pasture[0]).showRecord();
        //System.out.println((pasture[0]).getSpeed());
        
        //let sort them base on thier speed form fastest to slowest
        for (int i = 1; i < pasture.length; i++){
            while (i > 0 && pasture[i].getSpeed() > pasture[i - 1].getSpeed()){
                Pokemon temp = pasture[i - 1];
                pasture[i - 1] = pasture[i];
                pasture[i] = temp;
                i--;
            }
        }
            
        System.out.println("Your pasture record form fastest to slowest:");
        for (Pokemon x : pasture) {
            x.showRecord();
        }
    }
}
