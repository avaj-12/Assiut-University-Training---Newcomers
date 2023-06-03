import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        if(n%m==0 || m%n==0)
          System.out.println("Multiples");
        else
          System.out.println("No Multiples");  

    }
}
