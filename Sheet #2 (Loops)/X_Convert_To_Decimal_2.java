import java.util.*;
import java.lang.Math;

public class X_Convert_To_Decimal_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextLong();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1)
                    count++;
                n /= 2;
            }

            long sum = 0;
            for (int i = 0; i < count; i++) {
                sum += Math.pow(2, i);
            }
            System.out.println(sum);
        }

    }
}