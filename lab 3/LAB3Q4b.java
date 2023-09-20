package lab3.q4b;

import java.util.Scanner;

public class LAB3Q4b {

    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
        int number = input.nextInt();
         
            for(int i = number; i >= 1; i--){
                
                 for(int j = number; j > i; j--){
                      System.out.print(" ");
                 }
      
                 for(int k = 1; k < (2*i); k++){
                       System.out.print("#");
         }
                      System.out.println();
        }
        
    }
    
}
