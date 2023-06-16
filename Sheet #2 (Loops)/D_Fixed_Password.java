import java.util.*;

public class D_Fixed_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 1999) {
                System.out.println("Correct");
                count = 1;
            } else
                System.out.println("Wrong");

            if (count == 1)
                break;
        }

    }
}