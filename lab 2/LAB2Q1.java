package lab2.q1;

import java.util.Scanner;

public class LAB2Q1 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(number < 25){
            System.out.println("Grade : F");
    }
        else if(number <= 45 && number >= 25){
            System.out.println("Grade : E");
    }
         else if(number <= 50 && number >= 45){
            System.out.println("Grade : D");
    }
        else if(number <= 60 && number >= 50){
            System.out.println("Grade : C");
    }
         else if(number <= 80 && number >= 60){
            System.out.println("Grade : B");
    }
         else if(number > 80){
            System.out.println("Grade : A");
    }
        
    }
}
