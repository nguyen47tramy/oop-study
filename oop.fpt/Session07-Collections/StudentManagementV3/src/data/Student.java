
package data;

//Abstraction:
//Nhắc đến Sinh viên, ta chỉ cần quan tâm mã số, tên , năm sinh, chuyên ngành, điểm tb
//Encapsulation:
//Biểu diễn được đối tượng này như ngoài đời thực, ta cần Khuôn + đặc điểm + hành vi
//Để che giấu rồi show ra khi cân fthiwwts, gói trọn trong một object
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%6d|%6.1f|\n", 
                            id, name, yob, gpa);
    }
}
