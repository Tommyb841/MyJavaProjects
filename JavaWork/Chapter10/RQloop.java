import java.util.Scanner;

public class RQloop{
  
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        String input;
        char choice;
        boolean isGood = false;
       do {
            System.out.println("Do you want to repeat the program or quit?\n(R/Q)");
            input = kb.nextLine();
            choice = input.charAt(0); 
            if (choice == 'q' || choice == 'Q'){
                isGood = false;
              } else if(Character.isLetter(choice)) {
                isGood = true;
                }
         } while (isGood == true);
        System.out.println("Program over");
      }
  }
