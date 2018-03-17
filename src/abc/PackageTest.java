package abc;

import abc2.Employee;

import static java.lang.System.out;

public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Hussnain Chattha", 1000000, 2018, 3, 17);
        harry.raiseSalary(5);
        out.println("Name:" + harry.getName() + ",Salary:" +
                harry.getSalary() +"RS.");
        out.println("HireDay=" + harry.getHireDay());

    }
}

