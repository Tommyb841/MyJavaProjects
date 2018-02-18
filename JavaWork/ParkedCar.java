// for make, model license, and minutes parked.

public class ParkedCar{
  private String make;
  private String model;
  private String license;
  private int minutes;

  public ParkedCar(){
  }

  public void setMake(String make){
    this.make = make;
    }  

  public void setModel(String model){
    this.model = model;
    }

  public void setLicense(String lic){
    this.license = lic;
    }

  public void setMinutes(int min){
      this.minutes = min;
    }

  public String getMake(){
    return make;
    }

  public String getModel(){
    return model;
    }

  public String getLicense(){
   return license; 
    }
   public int getMinutes(){
      return minutes;
     }
   
 }
