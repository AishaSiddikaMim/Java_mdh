package lab2.q3;

import java.util.Scanner;

public class LAB2Q3 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        int nextPrimeNumber = nextPrime(number);
        System.out.println("The Next Prime Number Is = " + nextPrimeNumber);
   
    }  
        
     public static int nextPrime(int number){
            
            for(int i = number ; ; i++){
                if(isPrime(i)){
                    return i;
                }
            }
        }
     
     public static boolean isPrime (int value){
        
    int sqrtNumber = (int)Math.sqrt(value);
         
        for(int i = 2; i <= sqrtNumber; i++){
           
               if (value % i == 0){
                   return false;
               }
           }
                return true;
        }
       }
       
        

    
