import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(a>0.0&&b>0.0)
          System.out.println("Q1");
        else if(a<0.0&&b>0.0)
          System.out.println("Q2");
        else if(a<0.0&&b<0.0)
          System.out.println("Q3");
        else if(a>0.0&&b<0.0)
          System.out.println("Q4");
        else if(a==0.0&&b!=0.0) 
          System.out.println("Eixo Y");
        else if(b==0.0&&a!=0.0)
          System.out.println("Eixo X");
        else 
          System.out.println("Origem");   


    }
}
