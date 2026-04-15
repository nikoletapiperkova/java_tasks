package intermediate.six;

public class Student {
    private int facultyNumber;
    private String name;
    private String major;

    public Student(int facultyNumber, String name, String major) {
        this.facultyNumber = facultyNumber;
        this.name = name;
        this.major = major;
    }

    public int getFacultyNumber() {
        return this.facultyNumber;
    }

    public String getName() {
        return this.name;
    }
    public String getMajor() {
        return this.major;
    }
}
