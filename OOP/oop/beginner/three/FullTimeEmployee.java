package beginner.three;

public class FullTimeEmployee extends Employee {
    int monthlySalary;
    public FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public final int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateSalary(){
        return monthlySalary;
    }

}
