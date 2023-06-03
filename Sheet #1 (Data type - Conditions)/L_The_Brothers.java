import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.next();
        String last1 = scan.next();

        String name2 = scan.next();
        String last2 = scan.next();

        if(last1.equals(last2))  
          System.out.println("ARE Brothers");
        else
          System.out.println("NOT");
 

    }
}
