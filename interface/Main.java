
interface test{
// -------- greet1 function without body --------
public void greet1();
// -------- greet2 function without body --------
public void greet2();

}

// -------------------- this is a implemented class (kind of inherited) from the test interface --------------------
//  to access the interface, we need to implement (inherit) a class and create its objects to access the interface
class test2 implements  test{
  
  // -------- greet1 function body defined in implemented class --------
  public void greet1(){
    System.out.println("Hello"); 
  }
  
  // -------- greet2 function body defined in implemented class --------
  public void greet2(){
    System.out.println( "How are you?"); 
}

}



public class Main {
  
  public static void main(String[] args) {
    test2 obj = new test2();

    obj.greet1();
    obj.greet2();
  }

}
