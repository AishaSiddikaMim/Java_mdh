package lab2.q5;

import java.util.Scanner;

public class LAB2Q5 {

    public static void main(String[] args) {
      
       int number, storingTheNumber, remainder, armstrong = 0;
      
       Scanner input = new Scanner(System.in);
       number = input.nextInt();
       
       storingTheNumber = number;
       
       while(number > 0){
           remainder = number % 10;
           armstrong = (remainder * remainder * remainder) + armstrong;
           number = number / 10;  
       }
       
       if (storingTheNumber == armstrong){
          
           System.out.println("Armstrong Number");
       }
       
       else {
             System.out.println("Not Armstrong Number");
       }
    }
    
}
