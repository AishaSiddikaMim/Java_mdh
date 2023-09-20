package lab3.q15;

import java.util.Scanner;

public class LAB3Q15 {

    public static void main(String[] args) {
     
        int reverse = 0;
       int a;
       
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       
       do{
        a = number % 10;
        reverse = reverse * 10  + a;
        number = number / 10;
        
       } while(number != 0);
       
       System.out.println(reverse);
    }
    
    
    
}
