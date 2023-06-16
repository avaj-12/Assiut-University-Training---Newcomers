import java.util.*;

public class N_Numbers_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int t = scan.nextInt();

        while (t-- != 0) {
            int n = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}