import java.util.*;

public class C_Even_Odd_Positive_and_Negative {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t;
        int ev = 0, odd = 0, pos = 0, neg = 0;

        t = scan.nextInt();
        while (t-- > 0) {

            int i = scan.nextInt();

            if (i % 2 == 0) {
                ev++;
            }
            if (i % 2 != 0) {
                odd++;
            }
            if (i > 0) {
                pos++;
            }
            if (i < 0) {
                neg++;
            }
        }
        System.out.println("Even: " + ev);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);

    }
}