package org.example;

import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeCode;
    double salary;
    String dob;
    int age;

    public double calculateSalaryHike(double hikePercentage)
    {
        return salary+(salary*hikePercentage/100);
    }

    Employee(String employeeName, int employeeCode, double salary, String dob,int age)
    {
         this.employeeName= employeeName;
         this.employeeCode=employeeCode;
         this.salary=salary;
         this.dob= dob;
         this.age=age;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Shubham",12999,60000.0,"17/11/1897",22);
        Scanner ob = new Scanner(System.in);
        int hikePercentage;
        System.out.println(" Enter the hike Percentage : ");
        hikePercentage= ob.nextInt();
        double res = obj.calculateSalaryHike(hikePercentage);
        System.out.println(" Salary after hike is : "+ res);
        System.out.println(obj.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeCode=" + employeeCode +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                '}';
    }
}
