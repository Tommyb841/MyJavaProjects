public class PoliceOfficer{
  private String name;
  private int badge;

  // compare parked car to parkign meter and determine if time is expired.
  // issue parking ticket if time has expired.
  public PoliceOfficer(){
    
    }
  public void setName(String name){
      this.name = name;
    }
  public void setBadge(int badge){
      this.badge = badge;
    }

  public String getName(){
      return name;
    }

  public int getBadge(){
      return badge;
    }


  public boolean generateTicket(int car, int  meter){
    if (car > meter){
      return true;
    }else{
      return false;
      }
    }
}
