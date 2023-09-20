package lab5.q3;

public class Fraction {
    
    int numerator, denominator;
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator =  denominator;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
     public void setDenominator(int denominator){
        this.denominator = denominator;
    }
     
    @Override
     public String toString(){
        return "Fraction( " + numerator + "/" + denominator + "numertaor= " + numerator + "denominator" + denominator + ")";
     }
     
     public void add(int numerator, int denominator){
         System.out.println((this.numerator * denominator) + (this.denominator * numerator) + "/" + (this.denominator * denominator));
     }
     
     public void sub(int numerator, int denominator){
         System.out.println((this.numerator * denominator) - (this.denominator * numerator) + "/" + (this.denominator * denominator));
     }
     
     public void multiplication(int numerator, int denominator){
         System.out.println((this.numerator * numerator) + "/" + (this.denominator * denominator));
     }
     
     public void division(int numerator, int denominator){
         System.out.println((this.numerator * numerator) + "/" + (this.denominator * denominator));
     }
     
}
