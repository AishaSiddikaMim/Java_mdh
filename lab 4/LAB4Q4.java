package lab4.q4;

import java.util.Scanner;

public class LAB4Q4 {

    public static void main(String[] args) {
       
        
        int array[][];
        array = new int[100][100];
        
        int a = 3, b = 3, c = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input elements in the matrix:");
        
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        
        int determinant;
        
        int x =(array[0][0] * (array[1][1] * array[2][2] - array[1][2] * array[2][1]));
        int y =(array[0][1] * (array[1][0] * array[2][2] - array[1][2] * array[2][0]));
        int z =(array[0][2] * (array[1][0] * array[2][1] - array[1][1] * array[2][0]));
        
        determinant = x - y + z;
        System.out.println("The determinant of the given matrix is " + determinant);
    }
}
    
    

