import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double m = scan.nextDouble();

        double floor = Math.floor(n/m);
        double ceil = Math.ceil(n/m);
        double round = Math.round(n/m);
        
        System.out.println("floor " + (int)n + " / " +(int) m + " = " + (int)floor);
        System.out.println("ceil " + (int)n + " / " +(int) m + " = " + (int)ceil);
        System.out.println("round " + (int)n + " / " +(int) m + " = " + (int)round);

    }
}
