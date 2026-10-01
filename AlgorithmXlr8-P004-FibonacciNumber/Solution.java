import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print F(n).

        int res = fib(n);
        System.out.println(res);
    }

    private static int fib(int n){
        if(n <=0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }
}
