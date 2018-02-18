import java.util.Scanner;

public class CharConverter{
  
    public static void main(String[]args){
      
        char big, little;
        String input;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter a letter");
        input = kb.nextLine();

        big = input.charAt(0);

        little =
        Character.toLowerCase(big);

        System.out.println(little);
      }
  }
