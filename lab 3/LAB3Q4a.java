package lab3.q.pkg4a;

import java.util.Scanner;

public class LAB3Q4a {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        for(int i = 0; i < number; i++){
            
            for(int j = number; j >= 1; j--){
              
                if(j > i) {
                System.out.print(" ");
         }
                else{
                System.out.print(" #");
        }
          
        }
        System.out.println();
    }
    }
    
}
