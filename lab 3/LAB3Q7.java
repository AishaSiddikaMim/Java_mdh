package lab3.q7;

import java.util.Scanner;

public class LAB3Q7 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int a = 1;
        int b = size;
        
        for(int i = 0; i < size; i++){
            
            a = 1;
            
            for(int j = 0; j <= i; j++){
                
                System.out.print(a);
                a++;
            }
            
            for(int k = b - 1; k > 0; k--){
                
                System.out.print("*");
            }
            
            b--;
            System.out.println("");
        }
    }
    
}
