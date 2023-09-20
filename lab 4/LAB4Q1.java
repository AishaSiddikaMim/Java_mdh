package lab4.q1;

import java.util.Scanner;

public class LAB4Q1 {

    public static void main(String[] args) {
      
        System.out.println("Enter the size of the array : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        System.out.println("Enter the elements of the array : ");
        int array[];
        array = new int[100];
        
        for(int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        
        for(int i = 0; i < size-1; i++ ){
            
            for(int j = 0; j <size-i-1; j++){
                
                if(array[j] > array[j+1]){
                   
                    int sort = array[j];
                    array[j] = array[j+1];
                    array[j+1] = sort;
                }
            }
        }
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("The second smallest element is = " + array[1]);
    }
    }
    

