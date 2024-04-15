package LinkedList;
import java.util.LinkedList;

public class linkedlist {
  
public static void main(String[] args) {
LinkedList <String> cars = new LinkedList<>();

cars.add("Lamborghini");
cars.add("Audi");
cars.add("Tesla");

System.out.println(cars);

cars.addFirst("Hyundai");
cars.addLast("Pagani");

System.out.println(cars);

System.out.println(cars.getFirst());


cars.removeLast();
System.out.println(cars);
}


}
