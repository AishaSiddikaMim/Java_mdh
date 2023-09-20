package lab3.q2;

public class LAB3Q2 {

    public static void main(String[] args) {
   
        int a = 1;
        int b = 1;
        int c;
        
        System.out.println("The first 20 Fibonacci Numbers are = ");
        System.out.println(1);
        System.out.println(1);
             
        for(int i = 0; i < 18 ; i++){
            
            c = a + b;
            a = b; 
            b = c;
            
            System.out.println(c);
        }
        
    }
    
}
