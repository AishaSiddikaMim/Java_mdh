package lab2.q4;

import java.util.Scanner;

public class LAB2Q4 {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
       int fact = 1;
        
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of" + " " + number + " " + "is : " + fact);
    }
    
    
}
