package lab4.q7;

public class LAB4Q7 {

    public static void main(String[] args) {
    
        // int prime;
        
        for(int i = 2; i < 100; i++)
        {
           
            
             if (is_Prime(i) && is_Prime(i + 2))
                {
                  System.out.println(i + ", " + (i+2));   
                }
            }
    }

    public static boolean is_Prime(int prime) {
        if(prime < 2) return false;
             
        for(int i = 2; i <= prime / 2; i++)
        {
            if(prime % i == 0)  return false;
            
        }
            return true;
        }
    
}
    

