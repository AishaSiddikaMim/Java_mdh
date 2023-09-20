package lab3.q12;

import java.util.Scanner;

public class LAB3Q12 {

    public static void main(String[] args) {
       
         int gcd = 0;
         
        Scanner a = new Scanner(System.in);
         int number1 = a.nextInt();
         Scanner b = new Scanner(System.in);
         int number2 = b.nextInt();
       
        for(int i = 1; i <= number1 && i <= number2 ; i++){
         if(number1 % i == 0 && number2 % i == 0) {
            gcd = i;     
         }
         }
       
        System.out.println(gcd);
    
    }
    
}
