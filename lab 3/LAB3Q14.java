package lab3.q14;

import java.util.Scanner;

public class LAB3Q14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        int fact = 1;
        
        for(int i = 1; i <= number ; i++){
            fact = fact * i;   
        }
        
        System.out.println("Factorial of" + " " + number + "  " + "is = " + fact);
    }
    
}
