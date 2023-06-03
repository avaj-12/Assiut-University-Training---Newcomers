import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      char ch = scan.next().charAt(0);
      int c = (char) ch;

      if(c>=48&&c<65)
        System.out.println("IS DIGIT");
      else if(c>=65 && c<97)
      {
        System.out.println("ALPHA");
        System.out.println("IS CAPITAL");
      }
      else
      {
        System.out.println("ALPHA");
        System.out.println("IS SMALL");      
      }
        
 

    }
}
