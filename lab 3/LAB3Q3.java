package lab3.q3;

import java.util.Scanner;

public class LAB3Q3 {

    public static void main(String[] args) {
       
              Scanner input = new Scanner(System.in);
          int size = input.nextInt();
          
          for(int i = 1; i<= size; i++){
             
              for(int j = 1; j <= size; j++){
                  System.out.print("#");
              }
              System.out.println("");
          }
        
    }
    
}
