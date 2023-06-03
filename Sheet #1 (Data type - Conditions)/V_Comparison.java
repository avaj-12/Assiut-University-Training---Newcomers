import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char b = scan.next().charAt(0);
        int c = scan.nextInt();

            if (b == '>')
            {
              if (a > c)
                System.out.println("Right");
              else
                System.out.println("Wrong");
            }
            else if (b == '<')
            {
            if (a < c)
              System.out.println("Right");
            else
              System.out.println("Wrong");
            }
            else if (b == '=')
            {
            if (a == c)
              System.out.println("Right");
            else
              System.out.println("Wrong");
              
    }
 
    }
}
