package com.asad;


import java.util.*;

/**
 * This program demonstrates object construction.
 *
 * @author Cay Horstmann
 * 6
 * @version 1.01 2004-02-19
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Osama", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // print out information about all Employee objects

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() +
                    ",salary="
                    + e.getSalary());
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block

    static {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
        System.out.println("static block executed");
    }

    // object initialization block

    {
        id = nextId;
        nextId++;
        System.out.println("object initialization block executed");
    }


    // three overloaded constructors

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    Employee(double s) {
        // calls the Employee(String, double) constructor
        this("Asad" + nextId, s);
    }

    // the default constructor

    Employee() {
        // name initialized to ""--see below
        // salary not explicitly set- initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

