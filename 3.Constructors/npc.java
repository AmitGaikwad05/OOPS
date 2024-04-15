
class car{

  int speed;
  int mileage;

  void accelerate(){
    System.out.println("The car is accelerating");
  }

  void brake(){
    System.out.println("The car is De-accelerating");
  }


// ------- this is a constructor and is called everytime the object is created.-----
  car(  ){
    System.out.println("A constructor is called");
  }
  
}

public class npc {
  public static void main(String[] args) {
    car obj1 = new car();
    car obj2 = new car();

    // obj.speed = 286;
    obj1.accelerate();
    // obj.brake();
  }
}
