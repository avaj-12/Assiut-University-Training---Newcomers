import java.util.*;

public class S_Sum_of_Consecutive_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            int sum = 0;
            for (int i = x + 1; i < y; i++) {
                if (i % 2 == 1)
                    sum += i;
            }
            System.out.println(sum);
        }

    }
}