import java.io.Serializable;

public class Student implements Prototype<Student>, Serializable{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    //Copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.gpa = s.gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public Student copy() {
        return new Student(this);
    }
}
