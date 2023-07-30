package com.mycompany.practicle_3_2;

public class Practicle_3_2 {

    public static void main(String[] args) {
        var employee1 = new Employee(20000);
        employee1.setEmployeeName("Mogan");
        employee1.setBasicSalary(70000);
        
        System.out.println("Employee Name: "+employee1.getEmployeeName()); 
        System.out.println("Basic Salary: "+employee1.getBasicSalary()); 
        System.out.println("Bonus: "+employee1.getBonus()); 
        System.out.println("Bonus amount: "+employee1.calculateBonus()); 
    }
}
