package inheritance;

public class Manager1 extends Employee {
    private double bonus;

    Manager1(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
