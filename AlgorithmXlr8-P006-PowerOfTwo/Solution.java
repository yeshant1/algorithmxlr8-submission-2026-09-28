import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Write your solution here.
        // Print "true" if n is a power of two, otherwise print "false".

        if(n <= 0){
            System.out.println("false");
            return;
        }
         
        if(n == 1){
            System.out.println("true");
            return;
        }

        while(n > 1){
            if(n % 2 == 0){
                n  = n / 2;
            }else if(n % 2 != 0){
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
