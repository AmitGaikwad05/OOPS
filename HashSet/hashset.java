package HashSet;
import java.util.HashSet;

public class hashset{
  public static void main(String[] args) {
   
    HashSet<String> cars = new HashSet<>();
    cars.add("Audi");
    cars.add("Lamborghini");
    cars.add("Ferrari");
    cars.add("Audi");
    cars.add("BMW");

    System.out.println(cars);   // here only one Audi will be taken as input


    cars.remove("Ferrari");
    System.out.println(cars.contains("Audi"));   // checks if the element is present in the set. returns true is present
  }
}
