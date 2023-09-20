package lab4.q2;

import java.util.Scanner;

public class LAB4Q2 {

    public static void main(String[] args) {
        
        int array1[][],array2[][];
        array1 = new int[100][100];
        array2 = new int[100][100];
       
        int a = 0, b = 0, c = 0, d = 0;
        
        System.out.println("Enter the rows and columns of first matrix:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        
        System.out.println("Enter the rows and columns of second matrix:");
        c = input.nextInt();
        d = input.nextInt();
        
        if(a != b && c != d && a != c)
        {
            System.out.println("Not square Matrices");
            return;
    }
        
        System.out.println("Input elements in the first matrix:");
        for(int i = 0; i < a; i++)
            {
            for(int j = 0; j < b; j++)
            {
                array1[i][j] = input.nextInt();
            }
        }
        System.out.println("Input elements in the second matrix:");
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < d; j++)
            {
                array2[i][j] = input.nextInt();
            }
    }
    
}
}
