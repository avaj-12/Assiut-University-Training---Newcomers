import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
      
        int max = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        int min = c < (a < b ? a : b) ? c : ((a < b) ? a : b);  
  
        System.out.println(min + " " + max);
 

    }
}
