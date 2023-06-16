import java.util.*;

public class J_Primes_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean a = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                } else {
                    a = true;
                }
            }
            if (a == true)
                System.out.print(i + " ");
        }
    }
}