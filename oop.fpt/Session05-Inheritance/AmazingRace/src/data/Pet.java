
package data;
//không cụ thể ==> abstract class

//IMPLEMENTS INTERFACE tại class Cha. 
//Lưu ý: có những class Con không tham gia CLB nhưng do dòng họ/Cha
//tham gia nên nó bắt buộc cũng phải tham gia.

public abstract class Pet implements Racer{
    protected String name;
    protected int yob;
    protected double weight;
    protected double speed;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
    
    //hành động không cụ thể
    public abstract double run();
    public abstract void showRecord();
}
