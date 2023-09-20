package lab6.q3;

public class Manager extends Member {
    
    String department;

    public Manager(String Name, int Age, int PhoneNumber, String Address, int Salary) {
        
        super(Name, Age, PhoneNumber, Address, Salary);
    }

    public Manager(String Name, int Age, int PhoneNumber, String Address, int Salary, String department) {
        
        super(Name, Age, PhoneNumber, Address, Salary);
        this.department = department;
    }

    public void print()
    {
        System.out.println("Manager: ");
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(PhoneNumber);
        System.out.println(Address);
        System.out.println(Salary);
        System.out.println(department);
    }
}
