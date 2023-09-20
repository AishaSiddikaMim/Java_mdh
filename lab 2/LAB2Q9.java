package lab2.q9;

import java.util.Scanner;

public class LAB2Q9 {

    public static void main(String[] args) {
      
       int reverse = 0;
       int a;
       
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       
       while(number != 0){
        a = number % 10;
        reverse = reverse * 10  + a;
        number = number / 10;
        
       }
        System.out.println(reverse);
    }
    
}
    

