package HashMap;
import java.util.HashMap;
public class loophashmap{
  public static void main(String[] args) {
    HashMap<String, String> cities = new HashMap<>();

cities.put("India", "Delh");
cities.put("USA", "NewYork");
cities.put("Japan", "Tokyo");
cities.put("UK", "London");


// ---------------- for each loop ---------------

// ----------- Use KeySte() method to print the keys of the HashMap ----------

System.out.println("Keys of the hashmap here : ");
for(String key :cities.keySet()){
  System.out.println(key + " ");
}

System.out.println("Values of the hashmap here : ");

for(String values :cities.values()){
  System.out.println(values + " ");
}

// -------------- To print both keys and values --------------

for (String i : cities.keySet()) {
  System.out.println("key: " + i + " value: " + cities.get(i));
}


  }
}