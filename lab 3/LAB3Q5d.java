package lab3.q.pkg5d;

import java.util.Scanner;

public class LAB3Q5d {

    public static void main(String[] args) {
     
        
         Scanner input = new Scanner(System.in);
         int size = input.nextInt();
         
         int a = 1;
         int b = 0;
        
        for(int i = size - 1; i >= 0; i--){
            
            a = size;
            
            for(int j = 0; j <= i; j++){
                
                System.out.print(a + " ");
                a--;
            }
            
            size--;
            System.out.println("");
            b++;
        }
    }
    
}
