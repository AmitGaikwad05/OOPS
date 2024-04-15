//    Real-life example of an interface that can be implemented in coding is a Shape interface for geometric shapes. Let's consider a scenario where you have various shapes like circles, rectangles, and triangles, and you want to calculate their areas and perimeters



//---------------------------- Define the Shape interface --------------------------------
interface Shape {
  double calculateArea();
  double calculatePerimeter();
}

// ------------------ Implement the Circle class -----------------------
class Circle implements Shape {


  private double radius;
  
  // --------- parameterizedd constructor ----------
  public Circle(double radius) {
    this.radius = radius;
  }
  
  
  // --------- body of function in the interface -------------
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
  
  
  // --------- body of function in the interface -------------
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

// ------------------ Implement the Rectangle class -----------------------

class Rectangle implements Shape {
  private double width;
  private double height;
  
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  
  public double calculateArea() {
    return width * height;
  }
  
  
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}

// ------------------ Implement the Triangle class -----------------------
// Implement the Triangle class
class Triangle implements Shape {
  private double side1;
  private double side2;
  private double side3;
  public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
  }


  public double calculateArea() {
      // Heron's formula for calculating the area of a triangle
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }


  public double calculatePerimeter() {
      return side1 + side2 + side3;
  }
}
// ------------------------- Main class -----------------------------
public class example {

  //  -------------------- Main method ------------------------
  public static void main(String[] args) {
      
      Shape circle = new Circle(5);
      Rectangle rectangle = new Rectangle(4, 6);
      Triangle triangle = new Triangle(3, 4, 5);

      // Calculate and display the area and perimeter of each shape
      System.out.println("Circle Area: " + circle.calculateArea());
      System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

      System.out.println("Rectangle Area: " + rectangle.calculateArea());
      System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

      System.out.println("Triangle Area: " + triangle.calculateArea());
      System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
  }
}
