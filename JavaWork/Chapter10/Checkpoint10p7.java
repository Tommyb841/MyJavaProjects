import java.util.Scanner;

public class Checkpoint10p7{
  public static void main(String[]args){
    
    Scanner kb = new Scanner(System.in);
    String userInput;
    boolean accepted = true;
    
    do{
      System.out.println("Please enter a string.");
      userInput = kb.nextLine();
      System.out.println(userInput);

      if (userInput.endsWith("ger"))
      {
          System.out.println("Accepted");
          accepted = false; 
      }
      System.out.println(accepted);
    }
      while (accepted == true);
  }
}
