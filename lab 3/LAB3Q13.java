package lab3.q13;

import java.util.Scanner;

public class LAB3Q13 {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        int c = 1;
               
        for(int i = 0; i < number; i++){
            
            for(int a = 1; a <= number - i; a++){
                
                System.out.print(" ");
            }
        
            for(int j=0;j<=i;j++){
                
                if (j == 0 || i == 0){
                   
                    c = 1;
                }
                else{
                   
                    c = c * (i- j + 1) / j;
                }
                System.out.print(" " + c);
        }
            System.out.println("");
        }
    }
    
}
