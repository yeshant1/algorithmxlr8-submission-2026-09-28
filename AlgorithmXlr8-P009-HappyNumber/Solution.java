import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print "true" if n is a happy number, otherwise print "false".

        Set<Integer> s = new HashSet<>();
        while(n != 1 && !s.contains(n)){
            s.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;

        }

        if(n == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
