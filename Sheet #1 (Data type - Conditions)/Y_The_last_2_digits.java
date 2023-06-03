import java.util.*;

public class Y_The_last_2_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long a1 = a % 100;
        long b1 = b % 100;
        long c1 = c % 100;
        long d1 = d % 100;
        long prod = a1 * b1 * c1 * d1;
        if (prod % 100 <= 9)
            System.out.println("0" + prod % 100);
        else
            System.out.println(prod % 100);

    }

}