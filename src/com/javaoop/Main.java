package com.javaoop;
public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        var employee2 = new Employee(25000, 10);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(25);
        System.out.println(wage);
    }
}