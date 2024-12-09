/**
 * Represents a patron who takes and leaves books
 * 
 * @author Jacob Bianco
 * 
 * @version 10-5-2024
 */
 
 public class Patron {
 
   private String name;
   private String email;
   private int idNumber;
   private double balance;
   
   public Patron(String name, String email, int idNumber, double balance) {
   
      this.name = name;
      this.email = email;
      this.idNumber = idNumber;
      this.balance = balance;
   }
   
   public double adjustBalance(double amount) {
   
      return this.balance += amount;
   }
   
   public boolean equals(Object other) {
   
      if (other instanceof Patron) {
         Patron p = (Patron) other; // casting the other Object to Patron
         //now check if two Patron object's idnumbers are equal
         if (this.idNumber == p.idNumber) {return true;}
         
         return false;
      }
      
      
      else if (other instanceof Integer){
      
         if (this.idNumber == (Integer) other) {return true;}
         
         return false;
      // looks like the passed parameter is not Patron, rather an integer
      // so now check if this Patrons idnumber is equal to the other int idnumber
      }
      
      return false;
   }
   
   public String toString() {
   
      return "Name: " + this.name +
                         ", Email:" + this.email +
                         ", ID: " + this.idNumber +
                         ", Balance: " + this.balance + ".";
   }
 }