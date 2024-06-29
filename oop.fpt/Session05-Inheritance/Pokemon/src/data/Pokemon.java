
package data;
//class abstract
//class Cha
//đặc tính/ hành động của tất cả các loài/loại/con pokemon

public abstract class Pokemon {
    
    //thuộc tính
    protected String name; //
    protected int nationalNumber; //số hiệu trong pokedex
    protected String type; //
    protected String species; //giống loài
    protected double height; //chiều cao
    protected static final int MAX_LEVEL = 100;  //đây là đặc tính cố định của tất cả các pokemon
                                                 //để static riêng: Pokemon.MAX_LEVEL
    
    protected int speed;
//.. các đặc tính khác nữa
    
    //constructor
    public Pokemon(String name, int nationalNumber, String type, String species, double height) {
        this.name = name;
        this.nationalNumber = nationalNumber;
        this.type = type;
        this.species = species;
        this.height = height;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(int nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    
    //hành động
    //pokemon có thể chạy, mỗi con chạy khác nhau, xuất hiện khác nhau, có con chạy nhanh con chạy chậm
    //hành động chạy nên là abstract, vì nó chung chung, khi nói pokemon chạy ta chưa biết cụ thể nó ntn
    public abstract int run(); //hàm trả về giá trị để còn tái sử dụng
    //ngoài chạy pokemon còn có thể tương tác, nói chuyện, mỗi con có một tiếng nói khác nhau, âm thanh khác nhau
    //khi ta nói pokemon kêu, ta chưa hình dung cụ thể pokemon kêu ntn -> abstract
    public abstract String speak(); //hàm trả về giá trị để còn tái sử dụng 
    public abstract void showRecord(); 
}
