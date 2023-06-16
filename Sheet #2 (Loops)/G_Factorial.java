import java.util.*;

public class G_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            long fact = 1;
            for (int i = 1; i <= n; i++)
                fact = fact * i;

            System.out.println(fact);
        }

    }
}