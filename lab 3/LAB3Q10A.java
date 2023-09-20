package lab3.q10a;

import java.util.Scanner;

public class LAB3Q10A {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
       
        int i = 1;
        
        while(i <= size){
            
            int j = 1;
            
            while(j <= size - i){
                
                System.out.print(" ");
                j++;
            }
            
            int k = 1;
            
            while(k <= (2 * i - 1)){
            System.out.print(i);
            k++;
        }
            System.out.println();
            i++;
    }
    }
    
}
