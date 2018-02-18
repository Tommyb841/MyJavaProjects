public class ParkingTicket{ // use car class
 // use police officer class
 // use parking meter class
 

  private int fine = 25;
  private int time;

  public ParkingTicket(){
  }

  public void ticketHead(){
      System.out.println("\nPARKING TICKET");
    }
  //Report car make, model, and license.
  public void carReport(String make, String model, String lic ){
      System.out.println("Make: " + make  + "\nModel: " + model
                          + "\nLicense plate: " + lic+ "\n");
    }
  // Calculate the cost of the fine.
  public int fine(int min){
      time = min /60;

      for (int i = 1; i < time; i++){
          fine += 10;
        }
        return fine;
   }
  //Report the name and badge number of the issuing officer.
  public void officer(String name, int badge){
    System.out.println("Officer: " + name  + "." +
                        "\nBadge number: " + badge+ ".");
  }
}
