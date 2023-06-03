import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        double ans = 3.141592653* a * a;
        System.out.println(ans);
    }
}
