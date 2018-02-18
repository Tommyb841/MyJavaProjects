public class Odometer{
  private double currentMileage;
  private double maxMileage = 999999;
    
    public Odometer(){
      
      }

  //current milage
  public void setMileage(double miles){
    this.currentMileage = miles;
    }

  //reports current milage
  public double getMilage(){
      return currentMileage;
    }

  //increments current milage by 1. the max is 999,999
  //and resets at 0 after
  public void increaseMileage(){
    for(int i = 0; i > maxMileage; i++ ){
       currentMileage += currentMileage;
       if (i == maxMileage){
         i = 0;
         }
      }
    }

  //works with a FuelGauge object to decrease the fuel by 1
  //for every 24 miles passsed.
    public void burnFuel(FuelGauge fuel){
        for (int miles = 0; miles < 23; miles++ ){
          fuel.subFuel();
          }  
        System.out.println(fuel.getFuel()); 
      }
    }
