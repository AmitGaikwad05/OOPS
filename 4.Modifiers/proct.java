
class vehicle {

  String type;
  void start(){
System.out.println("The vehicle is starting");
  }
  
}



class car extends vehicle{
  
  String color;
String name;
int model;
}





// -------------  main class ---------------
public class proct{
  
  // -------------  main method ---------------
  public static void main(String[] args) {
  
car obj = new car();

obj.start();


}



}