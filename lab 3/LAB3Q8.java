package lab3.q8;

import java.util.Scanner;

public class LAB3Q8 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        int reverse = 0;
        int x = number;
        int y = 0;
        
        while(number > 0){
            
            y = number % 10;
            reverse = (reverse * 10) + y;
            number = number / 10;
        }
        
        if(reverse == x){
            
            System.out.println("Palindrome");
        }
        else{
            
            System.out.println("Not a Palindorme");
        }
    }
    
}
