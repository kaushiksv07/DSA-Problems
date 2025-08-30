public class StudentUtil {
    public void doCopy(Student student) {
//        Student copyStudent;
//        if (student instanceof IntelligentStudent) {
//            copyStudent = new IntelligentStudent((IntelligentStudent) student);
//        }else if (student instanceof Student) {
//            copyStudent = new Student(student);
//        }else{
//            throw new IllegalArgumentException("Student type not supported");
//        }

        //But hear SRP and OCP is failing
        //So we try to bring Prototype Design pattern

        Student copyStudent =  student.copy();
        System.out.println(copyStudent);
    }
}
