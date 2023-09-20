package lab3.q1;

import java.util.Scanner;

public class LAB3Q1 {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       
        if(number % 2 != 0){
            System.out.println("Odd number");
            System.out.println("bye!");
        }
        else {
            System.out.println("Even number");
            System.out.println("bye!");
        }
    }
    
}
