


// ----------------------------- Abstract class -----------------------------------
// We cannot create objects of the abstract class. to access the members of the abstract class, we have to inherit the abstract

abstract class test{

// --------- Abstract method -----------
 abstract void greet();
//  this method does not have body and the body is defined in the class inherited from this abstract class

// ---------normal method -----------
void greet1(){
  System.out.println("hello amit");
}

}


// ------------------ inherited class ---------------------

 class xyz extends test{

  // ------------ defining the abstact method here in the inherited class -----------
   void greet(){
    System.out.println( "Hello world" );
  }

}



// ------------------------------ Main Class -------------------------------------
public class test1 {

  // ----------------- main method ------------------
  public static void main(String[] args) {

    // test obj = new test();
    //  above line gives error as we cannot create object of the abstract class

    xyz obj = new xyz();
    // here we created the object of the inherited class and used it  to call the method which was declared in the abstract class.
obj.greet();
obj.greet1();

  }
}
