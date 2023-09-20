package lab6.q6;

public class Shape {
  
    public void print(){
        
        System.out.println("This is This is shape");
    }
}

class Circle extends Shape{
    
    public void print(){
        
        System.out.println("This is circular shape");
    }
}

class Rectangle extends Shape{
    
    public void print(){
        
        System.out.println("This is rectangular shape");
    }
}

class Square extends Rectangle{
    
    public void print(){
        
        System.out.println("Square is a rectangular");
    }
}

