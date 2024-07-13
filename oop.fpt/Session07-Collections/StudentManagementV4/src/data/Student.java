
package data;


public class Student {
    
    private String name;
    private String id;
    private int yob;
    private double gpa;

    public Student(String name, String id, int yob, double gpa) {
        this.name = name;
        this.id = id;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        System.out.printf("|%10s|%10s|%8d|%8f|\n",
                name, id, yob, gpa);
    }
}
