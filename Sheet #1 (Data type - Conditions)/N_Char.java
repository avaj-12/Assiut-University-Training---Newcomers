import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      char ch = scan.next().charAt(0);
      int c = (char) ch;

      if(c>=65 && c<97)
      {
        c+=32;
        System.out.println((char)c);
      }
      else
      {
        c-=32;
        System.out.println((char)c);
           
      }
        
 

    }
}
