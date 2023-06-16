import java.util.*;

public class V_PUM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 4 == 0) {
                    System.out.print("PUM");
                    count++;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}