package ArrayList;

import java.util.ArrayList;   // import ArrayList class
import java.util.Collections;  // import Collection class (have sort() method that is used to sort arraylist Alphabetically or Numerically)


public class AR {
 public static void main(String[] args) {
  
  ArrayList<String> cars = new ArrayList<String>();   // object for ArrayList created

  // ------------ Adding elements to ArrayList  ( add() method ) -----------
  
  cars.add("Lamborghini");
  cars.add("Audi");
  cars.add("Tesla");
  cars.add("Hyundai");
  cars.add("Honda");
  
  // ------------ Getting elements from ArrayList  ( get() method ) -----------
  System.out.println(cars.get(0));
  System.out.println(cars.get(3));
  
  
  // ------------ Updating elements from ArrayList  ( set() method ) -----------
  cars.set(4, "Toyota");
  System.out.println("updated car name : " + cars.get(4));
  
  
  // ------------ Remove element(delete) from ArrayList  ( remove() method ) -----------
  cars.remove(2);
  System.out.println(cars.get(2));   // Note : here the element at index 2 (Tesla) got removed. so the hyundai took the 2nd index position
  //   output : Hyundai
  
  
  // ------------ Remove ALL element(delete) from ArrayList  ( clear() method ) -----------
// cars.clear();


// ------------- Get the size of the array ( size() method ) -----------------
System.out.println("Total numbers of cars in the array : " + cars.size() );


// ================ Getting all elements using loop ==================

Collections.sort(cars);   // the ArrayList is sorted

for (int i = 0; i < cars.size(); i++) {
  System.out.println(cars.get(i));
}

 } 

}
