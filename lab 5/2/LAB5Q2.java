package lab5.q2;

import java.util.Scanner;

public class LAB5Q2 {

     static Book[] book = new Book[5];
    
     public static void main(String[] args) {
      
         int ISBN, numberOfPages, count;
         String bookTitle;
         
         int numberOfPage1,numberOfPage2;
         
          
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Input ISBN:");
            ISBN = input.nextInt();
            
            System.out.print("Input Book Title:");
            bookTitle = input.next();
            
            System.out.print("Input Number Of Pages:");
            numberOfPages = input.nextInt();
            
            book[i] = new Book(ISBN, bookTitle, numberOfPages );
        }
        
        System.out.print("Enter Number Of Pages:");
        numberOfPage1 = input.nextInt();
        System.out.print("Enter Number Of Pages:");
        numberOfPage2 = input.nextInt();
        isHeavier();
        displayAll();
                
   }

    public static void isHeavier() {
       for(int i = 0; i < 5 ; i++)
       {
           System.out.println(book[i].toString());
       }
    }

    public static void displayAll() {
        boolean x = false;
        for(int i = 0; i < 5 ; i++)
        {
            if(book[i].getNumberOfPages() > 500){
                x = true;
                System.out.println(x);
            }
            
            else
                 x = false;
                System.out.println(x);
        }
    }
    
}
