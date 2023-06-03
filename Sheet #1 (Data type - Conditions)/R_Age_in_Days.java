import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;


// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();

        int y = a/365;
        System.out.println(y + " years");
        int m = (a%365) / 30;
        System.out.println(m + " months");
        int d = (a%365) %30;
        System.out.println(d + " days");
    }
}
