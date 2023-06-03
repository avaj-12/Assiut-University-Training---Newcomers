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
        char d = scan.next().charAt(0);
        int e = scan.nextInt();


            if (b == '+')
            {
              if (a + c == e)
                System.out.println("Yes");
              else
                System.out.println(a+c);
            }
            else if (b == '-')
            {
            if (a - c == e)
              System.out.println("Yes");
            else
              System.out.println(a-c);
            }
            else if (b == '*')
            {
            if (a * c == e)
              System.out.println("Yes");
            else
              System.out.println(a*c);
              
    }
 
    }
}
