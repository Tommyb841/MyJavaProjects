public class Car{

  private String make, model, color, license;

  public Car(){
    // all setters
   }
   
    public void setMake(String make){
      this.make = make;
    }
    
    public void setModel(String model){
        this.model = model;
      }
    
   public void setColor(String color){
      this.color = color;
   } 

  public void setLicense(String license){
    this.license = license;  
  }
    // all getters

  public String getMake(){
    return make;
    }

  public String getModel(){
    return model;
    }

  public String getColor(){
    return color;
    }

  public String getLicense(){
    return license;
    }   
}

