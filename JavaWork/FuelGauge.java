public class FuelGauge{
   private int fuel;

   public FuelGauge(){
     
     }

     //The current amount of fuel.
     public void setFuel(int fuel){
       this.fuel = fuel;
       }
     //Displays the current amoutn of fuel.
     public int getFuel(){
       return fuel;
       }
     //incements the amount of fuel by 1 gallon max val 15 gallons
     public void addFuel(){
       while (this.fuel <= 15){
       for (int i =0; i < 14; i++){
         this.fuel += 1;
           }
         }
       }

     //decrements the amount of fuel by 1 gallon if greater than 0
     public void subFuel(){
        while (this.fuel >0){
            this.fuel -= 1;
          }       
       }
  }
