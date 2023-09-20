package lab6.q3;

import java.util.Scanner;

public class LAB6Q3 {

    public static void main(String[] args) {
      
        String Name;
        int Age;
        int PhoneNumber;
        String Address;
        int Salary;
        String specialization;
        String department;
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Name:");
        Name = input.next();
        System.out.print("Input Age:");
        Age = input.nextInt();
        System.out.print("Input Phone Number:");
        PhoneNumber = input.nextInt();
        System.out.print("Input Address:");
        Address = input.next();
        System.out.print("Input Salary:");
        Salary = input.nextInt();
        System.out.print("Input Specialization:");
        specialization = input.next();
        
        Employee employee = new Employee(Name, Age, PhoneNumber, Address, Salary, specialization);
        
        System.out.print("Input Name:");
        Name = input.next();
        System.out.print("Input Age:");
        Age = input.nextInt();
        System.out.print("Input Phone Number:");
        PhoneNumber = input.nextInt();
        System.out.print("Input Address:");
        Address = input.next();
        System.out.print("Input Salary:");
        Salary = input.nextInt();
        System.out.print("Input Department:");
        department = input.next();
        
        Manager manager = new Manager(Name, Age, PhoneNumber, Address, Salary, department);
        
        employee.print();
        manager.print();
    }
    
}
