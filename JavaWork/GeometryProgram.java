import java.util.Scanner;

public class GeometryProgram{
  public static void main(String[]args){
    Scanner kb = new Scanner(System.in);
    GeometryCalculator geo = new GeometryCalculator();
    int input;
    double radius, length, width, height, base;
  do {
    System.out.println("\nGeometry Calculator"); 
    System.out.println("1.Calculate the area of a circle."); 
    System.out.println("2.Calculate the area of a rectangle."); 
    System.out.println("3.Calculate the area of a triangle."); 
    System.out.println("4.Quit."); 
    System.out.println("\nPlease select a number 1-4"); 
    input = kb.nextInt();
     if (input == 1){
        System.out.println("\nEnter the radius of the circle.");
          radius = kb.nextDouble();
         System.out.println("The area is " + geo.Circle(radius));
       } 
    else if (input == 2){
      System.out.println("\nEnter the length and width of the rectangle.");
        length = kb.nextDouble();
        width = kb.nextDouble();
        System.out.println("The area is " + geo.Rectangle(length, width)); 
      }

    else if(input == 3){
      System.out.println("\nEnter the base and height of the triangle.");  
        base = kb.nextDouble();
        height = kb.nextDouble();
        System.out.println("The area is " + geo.Triangle(base, height));
      }
  }
     while ( input < 4 && input >= 1);
    
   } 
  }
