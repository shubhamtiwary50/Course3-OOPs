package org.example;

import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeCode;
    double salary=45000.0;
    String dob;
    int age;

    public double calculateSalaryHike(double hikePercentage)
    {
        return salary+(salary*hikePercentage/100);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        Scanner ob = new Scanner(System.in);
        int hikePercentage;
        System.out.println(" Enter the hike Percentage : ");
        hikePercentage= ob.nextInt();
        double res = obj.calculateSalaryHike(hikePercentage);
        System.out.println(" Salary after hike is : "+ res);
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
