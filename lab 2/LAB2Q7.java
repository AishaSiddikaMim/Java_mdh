package lab2.q7;

import java.util.Scanner;

public class LAB2Q7 {

    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
         double width = input.nextDouble();
         Scanner input1 = new Scanner(System.in);
         double height = input1.nextDouble();
         
         double area = width*height;
         double parameter = 2*(width+height);
         
         System.out.println("Area is" + "\t" + width + "*" + height + "" + "=" + area);
         System.out.println("Parameter is" + " " + 2 + "*" + "(" + width + "+" + height + ")" + "" + "=" + parameter);
    }
    
}
