package lab5.q3;

import java.util.Scanner;

public class LAB5Q3 {

    public static void main(String[] args) {
      
        int numerator, denominator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input 1st numerator:");
        numerator = input.nextInt();
        
        System.out.print("Input 1st denominator:");
        denominator = input.nextInt();
        
        Fraction frac = new Fraction(numerator, denominator);
        
        System.out.print("Input 2nd numerator:");
        numerator = input.nextInt();
        
        System.out.print("Input 2nd denominator:");
        denominator = input.nextInt();
        
        frac.add(numerator, denominator);
        frac.sub(numerator, denominator);
        frac.multiplication(numerator, denominator);
        frac.division(numerator, denominator);
        frac.toString();
    }
    }
    

