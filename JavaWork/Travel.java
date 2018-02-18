import java.util.Scanner:

public class Trave{
  public static void main(String[]args){
    Odometer odo = new Odometer();
    Scanner kb = new Scanner(System.In);
    FuelGauge fuel = new FuelGauge();
   double miles; 
    
    System.out.println("Welcome to your mileage calculator");
    System.out.println("----------------------------------");
    System.out.println("\nHow many miles are you traveling/");
    miles = kb.nextDouble();
    odo.setMileage(miles);
    System.out.println("\n");

    }
  }
