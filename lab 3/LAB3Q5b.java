package lab3.q5b;

import java.util.Scanner;

public class LAB3Q5b {

    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
         int size = input.nextInt();
         
         int a = 1; 
         int b = 0;
        
        for(int i = size - 1; i >= 0; i--){
            
            for(int j = 0; j < b; j++){
               
                System.out.print("  ");
            }
            
            a = 1;
            
            for(int j = 0; j <= i; j++){
                
                System.out.print(a + " ");
                a++;
            }
            
            System.out.println("");
            b++;
        }
      
    }
    
}
