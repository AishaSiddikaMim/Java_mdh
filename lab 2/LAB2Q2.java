package lab2.q2;

import java.util.Scanner;

public class LAB2Q2 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        int number2 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int number3 = input2.nextInt();
        
        if(number1 == number2 || number2 == number3 || number3 == number1){
            System.out.println("This is an isosceles triangle");
        }
        else if (number1 != number2 && number2 != number3 && number3 != number1){
            System.out.println("This is an scalene triangle");
        }
        else {
            System.out.println("This is an equilateral triangle");
        }
    }
    
}
