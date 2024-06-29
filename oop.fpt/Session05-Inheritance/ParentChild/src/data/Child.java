
package data;


public class Child extends Parent {
    
    //BIẾN DỊ 1: Biến dị thuộc tính
    protected String assetThree;

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
        //constructor nếu có extends thì phải khai báo của phụ hunh trước
        //Lý do là để bố trí ram cho phụ huynh trước, sau đó mới extends bộ nhớ cho phần của con
        
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    
    
    
    //di truyền
    @Override
    public void showProfile(){
        System.out.println("Parent{" + "assetOne= " + assetOne + ", assetTwo= " + assetTwo + ", assetThree= " + assetThree + '}');
    }
    
    //BIẾN DỊ 2: hàm mới hoàn toàn 
    public void sayHi(){
        System.out.println("This is mutation!");
    }
}
