package lab2.q6;

import java.util.Scanner;

public class LAB2Q6 {

    public static void main(String[] args) {
        
       int sum =0;
       
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       
     
       for(int i = 2; i <= number ; i++){
         
               if ( i %2 == 0){
                   sum++;
       
        System.out.println("Not Prime number = " + i);
       
               }
       }
        System.out.println("Total not prime numbers = " + sum);
       
       } 
    
}
   

