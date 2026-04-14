package intermediate.six;

public class Main{
    public static void main(String[] args) {
        Course c = new Course();
        Student st1= new Student(331, "nikoleta", "CS");
        Student st2 = new Student(248, "jana", "CS");
        Student st3 = new Student(101, "petar", "SE");
        c.addStudent(st1);
        c.addStudent(st2);
        c.addStudent(st3);

        c.printEnrolledStudents();

    }
}
