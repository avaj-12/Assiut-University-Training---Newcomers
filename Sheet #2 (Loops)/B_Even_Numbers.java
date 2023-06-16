import java.util.*;

public class B_Even_Numbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println(i);
            }
        }
        if (count == 0)
            System.out.println("-1");
    }
}