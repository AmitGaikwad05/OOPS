package HashMap;
import java.util.HashMap;
public class hmss {
  public static void main(String[  ] args) {
    
HashMap<String , String> CountriCities = new HashMap<>();

// ---- To add any key value pair : use put(key, value) method ------- 

// NOTE : IF the data is string, use inverted commas, else don't

CountriCities.put("USA", "NewYork");
CountriCities.put("India", "Delhi");
CountriCities.put("Japan", "Tokyo");

System.out.println(CountriCities);

// ------- To remove an item : use remove( key ) method and refer the key

CountriCities.remove("Japan");  // mention the key here

// ------ To remove all items, use clear() method

// CountriCities.clear();


//  -------------- To get any value : use get() method with key reference --------------

System.out.println(CountriCities.get("India"));


// ------- To get the size of the HashMap --------
int n = CountriCities.size();
System.out.println("Total no of country cities : " + n);




  }
}
