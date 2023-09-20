package lab5.q2;

public class Book {
    
    int ISBN, numberOfPages, count;
         String bookTitle;
        
        public Book(int ISBN, String bookTitle, int numberOfPages){
            this.ISBN = ISBN;
            this.bookTitle = bookTitle;
            this.numberOfPages = numberOfPages;
        }
        
        
        public Book (int count){
            this.count = count;
        }
        
        public Book(){
            this.ISBN = 0 ;
            this.bookTitle = " " ;
            this.numberOfPages = 0 ;
        }
        
    @Override
        public String toString(){
           return "Book" + "BookTitle" + bookTitle + "ISBN" + ISBN + "numberOfPages" + numberOfPages + "count" + count ;
        }
        
        public int compareTo(int book1, int book2){
            
            if(book1 > book2){
                System.out.println("1");
                return 1;
            }
            else if(book1 == book2)
            {
             System.out.println("0");
                return 0;   
            }
            else{
                System.out.println("-1");
                return -1;   
            }
        }
        
        public int getNumberOfPages(){
            return numberOfPages;
        }
        
        public int getCount(){
            return count;
        }
        
}
