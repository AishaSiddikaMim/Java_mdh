package lab6.q3;

public class Member {
    
    String Name;
    int Age;
    int PhoneNumber;
    String Address;
    int Salary;
    
    public Member(String Name, int Age, int PhoneNumber, String Address, int Salary) {
        this.Name = Name;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public void printSalary()
    {
        System.out.println("Salary of the members: " + Salary);
}

}
