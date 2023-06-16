import java.util.*;

public class R_Sequence_of_Numbers_and_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s = true;
        while (s) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            if (n > 0 && m > 0) {
                if (n > m) {
                    int temp = n;
                    n = m;
                    m = temp;
                }

                for (int i = n; i <= m; i++) {
                    System.out.print(i + " ");
                    sum += i;
                }
                System.out.println("sum =" + sum);
            } else
                s = false;

        }

    }
}