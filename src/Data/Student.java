package Data;

public class Student extends User {
    private int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student " +
                "[name = " + this.name +
                " age = " +  this.age  +
                " id = " +  id   + "]";
    }

}