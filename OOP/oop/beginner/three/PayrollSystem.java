package beginner.three;

import java.util.ArrayList;

public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Contractor(15, 30));
        employees.add(new FullTimeEmployee(300));
        int sum = 0;

        for(Employee e : employees ) {
            sum += e.calculateSalary();
        }

        System.out.println("The total sum of salaries is:" + sum);
    }


}
