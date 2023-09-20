package lab3.q5a;

import java.util.Scanner;

public class LAB3Q5a {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        int size = input.nextInt();
      
        for(int i = 1; i <= size; i++){
            
            for(int j = 1; j <= i; j++){
            
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
