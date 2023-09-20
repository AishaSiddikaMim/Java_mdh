package lab3.q6;

import java.util.Random;
import java.util.Scanner;

public class LAB3Q6 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int a = rand.nextInt(50);

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (a != number) 
        {
            if (number > a) 
            {
                System.out.println("Too high, try again");
                 number = input.nextInt();
            } 
            else if (number < a) 
            {
                System.out.println("Too low, try again");
                number = input.nextInt();
            }
        }
    }
    
}
