import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] n = new int[3];

        for(int i=0; i<3; i++)
        {
          n[i] = scan.nextInt();
        }
        int [] sorted = n.clone();

        Arrays.sort(n);

        for(int i=0; i<3; i++)
        {
          System.out.println(n[i]);
        }
        System.out.println();

        for(int i=0;i<3;i++)
        {
          System.out.println(sorted[i]);
        }
    }
}
