package assign1;

import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String args[]) {
        String name;
        int age;
        double salary;
        System.out.println("what is your name:");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Hi,  " + name + "!" + "  How old are you?");
        age = scan.nextInt();
        if (age <= 40) {
            System.out.println("So, you are:" + age + "  eh?" + "  That's not old at all");
        } else {
            System.out.println("So, you are:" + age + "  eh?" + "  you are too old");
        }
        System.out.println("How much do you make " + name + "?");
        salary = scan.nextInt();
        if (salary <= 1000) {
            System.out.println(name + "!" + "I hope that's per hour not per year.  LOL!");

        } else {
            System.out.println(name + "!" + "That's good earning.   ");

        }


    }
}


