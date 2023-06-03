import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while(n>=10)
          n/=10;

        if(n%2==0)
          System.out.println("EVEN");
        else
          System.out.println("ODD");    
        

    }
}
