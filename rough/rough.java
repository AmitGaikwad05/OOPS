import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
public class rough{

  public static void main(String[] args) {

// --------------------- Array List -------------------------    
System.out.println("-------------------- ArrayList ---------------------");
ArrayList <String> cars = new ArrayList<>();
cars.add("Lamborghini");
cars.add("Audi");
cars.add("Ford");
cars.add("Hyundai");

cars.set(2, "Mustang");

System.out.println("ArrayList Elements : " + cars);


// --------------------- LinkedList -------------------------    
System.out.println("-------------------- LinkedList ---------------------");
LinkedList<Integer> age = new LinkedList<>();
age.add(21);
age.add(19);
age.add(33);

age.add(55);  // element added to the end of the LinkedList
age.add(2, 47);   // element added in the middle of the LinkedList

age.addFirst(11);  // element added at the first position of the LinkedList
age.addLast(88);  // element added to the last position of the LinkedList

age.set(2, 44);

System.out.println("LinkedList Elements : " + age);
System.out.println("Element at index position 2 : " + age.get(2));
System.out.println("Element at first position : " + age.getFirst());
System.out.println("Total elements in the LinkedList : " + age.size());


System.out.println("-------------------- HashSet ---------------------");
HashSet<String> cities = new HashSet<>();
cities.add("Delhi");
cities.add("Sambhaji Nagar");
cities.add("Mumbai");
cities.add("Pune");
cities.add("Sambhaji Nagar");

cities.contains("Pune");   // checks if the element exists


if (cities.contains("Pune")) {
System.out.println("Pune element is present in HashSet");  
}
else{
  System.out.println("Pune element is not in HashSet");  
}


System.out.println("HashSet elements : " + cities);  // only unique elements will be stored in the HashSet

System.out.println("-------------------- HashMap ---------------------");

HashMap<String, String> countrycities = new HashMap<>();

countrycities.put("India", "Delhi");
countrycities.put("UK", "London");
countrycities.put("USA", "NewYork");
countrycities.put("Japan", "Tokyo");

System.out.println(countrycities.get("India"));

for(String s : countrycities.keySet()){
System.out.println(s +  " ");
}



}

}

