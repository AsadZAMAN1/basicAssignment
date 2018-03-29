package inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager1 boss1 = new Manager1("Omar Gull", 456789, 2018, 3, 29);
        boss1.setBonus(12345);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[4];
        staff[0] = boss1;
        staff[1] = boss;
        staff[2] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[3] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",HireDay=" + e.getHireDay());

    }
}


