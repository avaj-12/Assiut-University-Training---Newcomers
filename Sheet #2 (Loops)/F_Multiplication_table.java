import java.util.*;

public class F_Multiplication_table {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " " + "* " + i + " = " + n * i);

        }
    }
}