import java.util.*;

public class O_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char op = ' ';
        int mid = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                op = s.charAt(i);
                mid = i;
                break;
            }
        }
        switch (op) {
            case '*':
                System.out.println(Integer.parseInt(s.substring(0, mid)) * Integer.parseInt(s.substring(mid + 1)));
                break;
            case '+':
                System.out.println(Integer.parseInt(s.substring(0, mid)) + Integer.parseInt(s.substring(mid + 1)));
                break;
            case '-':
                System.out.println(Integer.parseInt(s.substring(0, mid)) - Integer.parseInt(s.substring(mid + 1)));
                break;
            case '/':
                System.out.println(Integer.parseInt(s.substring(0, mid)) / Integer.parseInt(s.substring(mid + 1)));
                break;
        }

    }
}
