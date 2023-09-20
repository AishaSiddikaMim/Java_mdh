package lab5.q1;

public class Icecream {
    
    String icecreamType, icecreamCompany;
    double icecreamPrice;
 
    public Icecream()
    {
        this.icecreamType = " " ;
        this.icecreamCompany = " " ;
        this.icecreamPrice = 0 ;
    }
    
    public Icecream(String icecreamType, String icecreamCompany, double icecreamPrice)
    {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    public String getIcecreamType() {
        return icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

   
    public static boolean equals(Icecream I){
        boolean x = false;
         for(int i = 0; i < 3; i++){
            if(icecream[i].getIcecreamPrice() > icecreamPrice){ 
                 x = true;
                  System.out.println(x);
             }
             else{
                  x = false;
                  System.out.println(x);
             }
             
         }
         return x;
    }

    public int compareTo(int Icecream1, int Icecream2) {
      
        if(Icecream1 > Icecream2){
           System.out.println("1");
           return 1;
       
        }
        else if(Icecream1 == Icecream2){
           System.out.println("0");
           return 0; 
        }
        else
            System.out.println("-1");
           return -1; 
    }
    

    @Override
    public String toString()
    {
        return this.icecreamCompany + " " + this.icecreamType + " (" + this.icecreamPrice + "" + ")";
    }
}
