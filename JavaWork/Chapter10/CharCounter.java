import javax.swing.JOptionPane;

public class CharCounter{
  public static void main(String []args){
    
    int counter= 0;
    String input;
    int numLet;

    input = 
    JOptionPane.showInputDialog("Please enter a string with upper and lower case characters.");
    

    numLet = input.length();
    
     for(int i = 0; i < numLet; i++ ){
      char  ch = input.charAt(i);
       if(Character.isUpperCase(ch)){
        counter += 1;
       }
      }

      JOptionPane.showMessageDialog(null, counter); 
    }
  }
