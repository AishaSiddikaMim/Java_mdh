package lab3q.pkg10b;

import java.util.Scanner;

public class LAB3Q10B {

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
            
            int k = i;
            while(k >= 1){
                
                System.out.print(k);
                k--;
            }
            
            int l = 2;
                    
            while(l <= i){
               
                System.out.print(l);
                l++;
            }
            
            System.out.println();
            i++;
        }
    }
    
}
