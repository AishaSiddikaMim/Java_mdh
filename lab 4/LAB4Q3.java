package lab4.q3;

import java.util.Scanner;

public class LAB4Q3 {

    public static void main(String[] args) {
      
        int array[][];
        array = new int[100][100];
        
        int a = 0, b = 0, c = 0;
        
        System.out.print("Enter the number of rows and columns of matrix:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        
        System.out.print("Input elements in the matrix:");
       
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                array[i][j] = input.nextInt();
                if(i == j)
                {
                    c += array[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements:" + c);
    }
    
}
