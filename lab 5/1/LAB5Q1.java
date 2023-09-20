package lab5.q1;

import java.util.Scanner;

public class LAB5Q1 {

    static Icecream[] icecream = new Icecream[3];

    public static void main(String[] args) {
        
        String icecreamCompany, icecreamType;
        double icecreamPrice;
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Input Icecream Company:");
            icecreamCompany = input.next();
            
            System.out.print("Input Icecream Type:");
            icecreamType = input.next();
            
            System.out.print("Input Icecream Price:");
            icecreamPrice = input.nextDouble();
            
            icecream[i] = new Icecream(icecreamCompany, icecreamType, icecreamPrice);
        }
        
        System.out.print("Enter company name:");
        icecreamCompany = input.next();
        searchByCompany(icecreamCompany);
    }
   
    public static void searchByCompany(String icecreamCompany)
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println(icecream[i].toString());
        }
    }
    
}
