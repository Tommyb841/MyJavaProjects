import java.util.Scanner;

public class RQloop{
  
    public static void main(String[]args) throws Exception{
        Scanner kb = new Scanner(System.in);
        String input;
        char choice;
        boolean isGood = false;
       int x = 1;
       do{
       try{
         do {
            System.out.println("Would you like to"
           +  " repeat the program?");
            input = kb.nextLine();
            choice = input.charAt(0); 
            if (Character.isLetter(choice) &&
               Character.toUpperCase(choice) == 'Q'){
                isGood = false;
              } else if(choice == 'r' || choice == 'R') {
                isGood = true;
              } else if(Character.isWhitespace(choice) || choice != 'R') {
               System.out.println("That is not a valid input.");
                isGood = true;
                }
         } while (isGood == true);
            System.out.println("Program over");
            x = 2;
      }
      catch (Exception e){
        System.out.println("You cant fucking do that idiot." +
                             " Choose the correct letter."); 
        }
       } while (x==1);
    }
  }
