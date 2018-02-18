import java.util.Scanner;

public class GeometryCalculator{
 //This static method calculates the area of a circle.
 public GeometryCalculator() {
   
   }
 // Calculate the areasa of a circle 
  static double Circle(double r){
       if( r < 0){
         System.out.println("Error cannot accept a " +
                             "negative  number");  
         }
       double area;
      area = Math.PI * (r*r); 
      return area;
    }
// Calculates the area of a rectangle.
  static double Rectangle(double len, double width){
      if (len < 0 || width < 0 ){
         System.out.println("Error cannot accept a " +
                             "negative  number");  
        }
      double area;
      area = len* width;
      return area;  
    }

// Calculates the area of a triangle
  static double Triangle(double base, double height){
         if (base  < 0 || height < 0){
         System.out.println("Error cannot accept a " +
                             "negative  number");  
         }
    double area;
    area = base * height * 0.5;
    return area;
     }
}
