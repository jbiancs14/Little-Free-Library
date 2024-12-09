/**
 * Represents a book that patrons can take and leave
 * 
 * @author Jacob Bianco
 * 
 * @version 10-5-2024
 */
 
import java.util.Date;

 public class Book {
 
   public static final int AVAILABLE = 1;
   
   public static final int UNAVAILABLE = 2;
   
   private String title;
   
   private String author;
   
   private String isbn;
   
   private int pages;
   
   private int year;
   
   private int status;
   
   private Date due;
   
   private Patron patron;   
   
   
   // INITALIZES ALL ATRIBUTES OF THE BOOK OBJECT
   public Book(String title, String author, String isbn, int year, int pages) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.year = year;
      this.pages = pages;
      this.status = UNAVAILABLE;
      this.patron = null;
      this.due = null;
      
   }
   
   public void checkin() {
      this.status = AVAILABLE;
      this.due = null;
      this.patron = null;
      
   }
   
   public void checkout(Patron patron, Date due) {
      this.status = UNAVAILABLE;
      this.patron = patron;
      this.due = due;
   }
   
   public boolean equals(Object other) {
      if (other instanceof Book) {
         Book b = (Book) other; // casting the other Object to Book
         //now check if two Book object's isbn are equal
         if (this.isbn.equals(b.isbn)) {return true;}
        
         return false;
                    
      }
      else if (other instanceof String){
      // looks like the passed parameter is not Book, rather a string
      // so now check if this String isbn is equal to the other Books isbn
         if (this.isbn.equals(other)) {return true;}
         
         return false;
         
         }
      return false;
   }
   
   public String getTitle() {return this.title;}
   
   public String getAuthor() {return this.author;}
   
   public String getIsbn() {return this.isbn;}
   
   public int getPages() {return this.pages;}
   
   public int getYear() {return this.year;}
   
   public int getStatus() {return this.status;}
   
   public Date getDue() {return this.due;}
   
   public Patron getPatron() {return this.patron;}

   
   public String toString() {
   
      return "Title: " + this.title + 
                         ", Author: " + this.author +
                         ", ISBN: " + this.isbn +
                         ", Year: " + this.year +
                         ", Pages: " + this.pages + ".";
   }
 }