package com.Employeeapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        EmployeeDaoInterface dao = new EmployrrDaoImpl();
        System.out.println("Welcome to Employee Management");

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n1. Add Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Show Employee based on id\n" +
                    "4. Update the Employee\n" +
                    "5. Delete the Employee\n");

            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter ID : ");
                    id = scanner.nextInt();
                    System.out.println("Enter name ");
                    name = scanner.next();
                    System.out.println("Enter Salary ");
                    double salary = scanner.nextDouble();
                    System.out.println("Enter Age");
                    int age = scanner.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id ");
                    int empip = scanner.nextInt();
                    dao.showEmployeeBasedonId(empip);
                    break;
                case 4:
                    System.out.println("Enter id to update");
                    int empid = scanner.nextInt();
                    System.out.println("Enter new name");
                    name = scanner.next();
                    dao.updateEmployee(empid, name);
                    break;
                case 5:
                    System.out.println("Enter id to delete");
                    id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.printf("Enter valid choice !");
                    break;


            }
        } while (true);
    }
}
