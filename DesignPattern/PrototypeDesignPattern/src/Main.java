public class Main {
    public static void main(String[] args) {
        StudentUtil studentUtil = new StudentUtil();
        Student student = new Student("MS Dhoni", 53, 71);
//        Student student2 = new Student(student);

        IntelligentStudent intelligentStudent = new IntelligentStudent("V Kohli", 28, 99, 100);
//        IntelligentStudent intelligentStudent1 = new IntelligentStudent(intelligentStudent);

        studentUtil.doCopy(student);
        studentUtil.doCopy(intelligentStudent);
    }
}