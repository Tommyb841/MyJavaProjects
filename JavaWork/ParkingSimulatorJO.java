import javax.swing.JOptionPane;
import java.util.Scanner;

public class ParkingSimulatorJO{
  public static void main (String[]args){

//  Scanner kb = new Scanner(System.in);
  ParkedCar car = new ParkedCar();
  ParkingMeter meter = new ParkingMeter();
  PoliceOfficer po = new PoliceOfficer();
  ParkingTicket pt = new ParkingTicket();

  String officer, make , model, license;
  String input;
  int min;
  int carMin;
  int meterMin;
  boolean ticket;
  int finePrice;
  int badgeNum;
   
  //set make
  input =
  JOptionPane.showInputDialog("Enter the make of the car.");
  car.setMake(input);

  //set model
  input =
  JOptionPane.showInputDialog("Enter the model of the car.");
  car.setModel(input);

  //set license
  input =
  JOptionPane.showInputDialog("Enter the license of " +
                              "the car.");
  car.setLicense(input);

  // set meter paid
  input = 
  JOptionPane.showInputDialog("Enter the number of " + 
                              "minutes paid.");
  min = Integer.parseInt(input);
  meter.setMeter(min);
  meterMin = meter.getMeter();

  //set minutes parked
  input =
  JOptionPane.showInputDialog("Enter the number of " +
                                "minutes parked.");
  min = Integer.parseInt(input);
  car.setMinutes(min);
  carMin = car.getMinutes();

  // determine if ticket is needed
  ticket = po.generateTicket(carMin, meterMin); 
  if ( ticket = true){
    // this simulates the parking ticket generator
  //  JOptionPane.showMessageDialog(,null 
  //  "         PARKING TICKET GENERATOR         ");
   // System.out.println("         ------------------------         ");
   // kb.nextLine();
    input =
    JOptionPane.showInputDialog("Please enter your name.");
    po.setName(input);
    officer = po.getName();

    input =
    JOptionPane.showInputDialog("Enter your badge number.");
    min = Integer.parseInt(input);
    po.setBadge(min);
    badgeNum = po.getBadge();
    // end of ticket 

    // print the vehicle information.
    make = car.getMake();
    model = car.getModel();
    license = car.getLicense();
    pt.ticketHead();
    pt.carReport(make, model, license);
    
    //print officer info
    pt.officer(officer, badgeNum);
    
    finePrice = pt.fine(carMin); 
   JOptionPane.showMessageDialog(null,"The cost of the " +
                        "fine will be: $" +finePrice+ ".\n");
    }

  // print ticket with vehicle and officer info.

    }
  }
