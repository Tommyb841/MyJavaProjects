import java.util.StringTokenizer;

public class Checkpoint10p27{
  public static void main(String[]args){
    String st = "/home/rjones/mydata.txt";
    String[] tokens = st.split("[/.]");
    for (String s : tokens)
    {
      System.out.println(s);
    }
  }
}
