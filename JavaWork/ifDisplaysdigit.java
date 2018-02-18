import java.util.Scanner;

public class ifDisplaysdigit{
    public static void main(String[]args){
      
      Scanner kb = new Scanner(System.in);
      String input;
      char ch;

      System.out.println("please enter a digit");
      input = kb.nextLine();
      
      ch = input.charAt(0);

      if (Character.isDigit(ch)){
        System.out.println("Digit");
        }
        else{
          System.out.println("not a digitf");
        }
    }
  }
