import java.util.*;

public class Y_Easy_Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1)
            System.out.print(a);
        else if (n == 2)
            System.out.print(a + " " + b);
        else {
            System.out.print(a + " " + b);
            for (int i = 1; i <= n - 2; i++) {
                int fib = a + b;
                a = b;
                b = fib;
                System.out.print(" " + fib);
            }
        }

    }
}