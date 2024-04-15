
// RUNTIME POLYMORPHISM : 

// In runtime polymorphism, the method of superclass is overridden with the method of that derived class, whose object is created with reference variable of the super class
// Upcasting : 
// If the reference variable of Parent class refers to the object of Child class, it is known as upcasting

package Polymorphism;

// super class
class Animal {
  
  void sound(){
    System.out.println("beep beep");
  }
}


// base class 1
class dog extends  Animal{
  void sound(){
    System.out.println("woof woof");
  }
  
}

// base class 2
class cat extends  Animal{
  
  void sound(){
    System.out.println("Meowww Meowww");
  }
  
}

// base class 3
    class vedant extends  Animal{
    
        void sound(){
          System.out.println("bak bak bak");
        }
      
}


public class runtime {
public static void main(String[] args) {
Animal a1 = new dog();
a1.sound();
// here a1 is the reference variable refering to the object of child class. therefore the method in dog class will get executed
Animal a2 = new cat();
a2.sound();
// here a2 is the reference variable refering to the object of child class. therefore the method in cat class will get executed
}  
}

