package lab7.qb;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB7QB {

    public static void main(String[] args) {
        
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of lines:");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter number of integer in each line:");
            
            int d = input.nextInt();
            
            for (int j = 0; j < d; j++)
            {
                intArrayList.add(input.nextInt());
            }
           listArray.add(intArrayList);
        }
        
        System.out.print("Enter number of lines for output:");
        int n1 = input.nextInt();
        
        for(int i = 0; i < n1; i++)
        {
            System.out.print("Enter line number:");
            int d = input.nextInt();
            
            System.out.print("Enter position number:");
            int q = input.nextInt();
            
            System.out.println("Output:" + listArray.get(d-1).get(q-1));
        }
    }
    }
    

