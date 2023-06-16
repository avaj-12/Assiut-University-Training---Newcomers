import java.util.*;

public class E_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int max = Integer.MIN_VALUE;
        while (t-- != 0) {
            int n = scan.nextInt();
            if (n >= max)
                max = n;
        }
        System.out.println(max);
    }
}