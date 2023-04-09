import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long num2 = scan.nextLong();
        long add = num + num2;
        long mul = num * num2;
        long sub = num - num2;
        System.out.println(num + " + " + num2 + " = " + add);
        System.out.println(num + " * " + num2 + " = " + num*num2);
        System.out.println(num + " - " + num2 + " = " + sub);




    }
}
