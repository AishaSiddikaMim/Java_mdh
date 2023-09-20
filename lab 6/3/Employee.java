package lab6.q3;

public class Employee extends Member{
    
    String specialization;

    public Employee(String Name, int Age, int PhoneNumber, String Address, int Salary) {
       
        super(Name, Age, PhoneNumber, Address, Salary);
    }
    
    public Employee(String Name, int Age, int PhoneNumber, String Address, int Salary, String specialization) {
        
        super(Name, Age, PhoneNumber, Address, Salary);
        this.specialization = specialization;
    }

    public void print()
    {
        System.out.println("Employee: ");
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(PhoneNumber);
        System.out.println(Address);
        System.out.println(Salary);
        System.out.println(specialization);
    }
}
