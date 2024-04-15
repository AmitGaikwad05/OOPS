import java.time.LocalDate;  // for  LocalDate class
import java.time.LocalTime;  // for LocalTime class
import java.time.LocalDateTime;   // for Local Date and Time class 

import java.time.format.DateTimeFormatter;    // class having methods to format  and parse date and time

public class Main {
  public static void main(String[] args) {
    
    // ----- to print local date -----
    System.out.println("----------- Local date ----------");
    LocalDate obj1 = LocalDate.now();
    System.out.println(obj1);
    
    // ----- to print local time -----
    System.out.println("----------- Local time ----------");
    LocalTime obj2 = LocalTime.now();
    System.out.println(obj2);
    
    // ----- to print local date and time both -----
    System.out.println("----------- Local date & time ----------");
    LocalDateTime obj3 = LocalDateTime.now();
    
    System.out.println(obj3);
    
    System.out.println("----------- Formatted Local date & time ----------");

    DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
// create object of the dateTimeFormatter class. use ofpattern() method to set the format of date and time.
    String updateDateTime = obj3.format(formatobj);
    //  create a string variable. concatinate the date and time object to be formatted  using format() method.
System.out.println(updateDateTime);
  }



/*


Differnt format for date 

yyyy-MM-dd   -  	"1988-09-29"	
dd/MM/yyyy	  -     "29/09/1988"	
dd-MMM-yyyy	  -   "29-Sep-1988"	
E, MMM dd yyyy	 -   "Thu, Sep 29 1988"


 */


}
