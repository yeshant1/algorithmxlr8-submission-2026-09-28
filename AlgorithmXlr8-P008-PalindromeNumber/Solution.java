import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        // Write your solution here.
        // Print "true" if x is a palindrome, otherwise print "false".
        if (x < 0) {
            System.out.println(false);
            return;
        }

        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(reversed));
    }
}
