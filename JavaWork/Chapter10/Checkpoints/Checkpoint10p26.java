import java.util.StringTokenizer;

public class Checkpoint10p26 {
  public static void main (String[]args){
    StringTokenizer str = new StringTokenizer("one two three four");
    int x = str.countTokens();
    String stuff =  str.nextToken();

    System.out.println(stuff);
    System.out.println(x);
      
  }
}
