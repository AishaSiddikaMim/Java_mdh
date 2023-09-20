package lab4.q8;

import java.util.Scanner;

public class LAB4Q8 {

    static int fact,factans = 1;
   
    public static void main(String[] args){

        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        fact = input.nextInt();
        factorial();
    }
    public static void factorial()
    {
        if(fact == 1)
        {
            System.out.println("Factorial: " + factans);
            return;
        }
        
        factans = factans*fact;
        fact = (fact-1);
        factorial();
    }
    
    }
   
    

