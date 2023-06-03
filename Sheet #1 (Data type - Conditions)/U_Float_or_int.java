import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float d = scan.nextFloat();
        float ans = 0;
        ans =  d - (int)d;
        if(d - (int)d == 0)
          System.out.println("int " + (int)d);
        else
          System.out.printf("float "+ (int)d + " " + ans);  


    }
}
