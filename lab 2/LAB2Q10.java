package lab2.q.pkg10;

public class LAB2Q10 {

    public static void main(String[] args) {
       
        int sum = 0;
        int x  = 0;
        
    for(int i = 2; i < 542 ; i++){
             x = 0;
        
     for(int j = 2 ; j < i; j++){
        
         if(i % j == 0){
             x++;
         }  
     }
        if (x == 0){
           sum += i;
        }
    }
     System.out.println("The sum of the first 100 prime numbers = " + sum);
    
    }
    
}
