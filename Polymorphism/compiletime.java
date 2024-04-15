package Polymorphism;

class addition{

  int add(int a, int b){
    System.out.println("The method with 2 integer  arguments is called");
    return a+b;
  }
  
  int add(int a, int b, int c){
    
    System.out.println("The method with 3 integer  arguments is called");
    return a+b+c;
  }
  
  float add(float a, float b){

    System.out.println("The method with 2 float  arguments is called");
return a+b;
  }
  
  float add(int a, float b){
    System.out.println("The method with 2 float  arguments is called");
    return a+b;
  }

}

public class compiletime {
  public static void main(String[] args) {
addition obj =new addition();


System.out.println();

  }
}
