import java.util.*;

public class I_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0, temp = n;
        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        System.out.println(rev);
        if (rev == temp)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}