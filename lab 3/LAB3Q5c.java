package lab3.q5c;

import java.util.Scanner;

public class LAB3Q5c {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int j;
        
            for(int i = size; i >= 1; i--){
              
               for(j = 1; j <= i-1 ; j++){
                
                System.out.print(" ");
             
            }
            for(j = size - i + 1; j >= 1; j-- ){
                System.out.print(j);
            }
                System.out.println();
        }
    
    }
    
}
