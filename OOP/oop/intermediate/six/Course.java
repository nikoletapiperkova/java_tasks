package intermediate.six;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;

    public Course(){
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void removeStudent(Student s){
        this.students.remove(s);
    }

    public void printEnrolledStudents(){
        for(Student s: students){
            String message = new StringBuilder()
                    .append(s.getName())
                    .append(" ")
                    .append(s.getFacultyNumber())
                    .append(" ")
                    .append(s.getMajor())
                    .toString();
            System.out.println(message);

        }
    }

}

