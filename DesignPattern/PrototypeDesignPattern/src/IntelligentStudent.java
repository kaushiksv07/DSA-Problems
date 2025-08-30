import java.io.Serializable;

public class IntelligentStudent extends Student  {
    private int iq;

    public IntelligentStudent(String name, int age, double gpa, int iq) {
        super(name, age, gpa);
        this.iq = iq;
    }

    //Copy Constructor
    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + getGpa() +
                ", iq=" + iq +
                '}';
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
