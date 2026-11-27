import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print n rows, row i (1-indexed) containing (n - i + 1) stars, left aligned.

        for(int i=1;i<=n;i++){
            for(int stars = n-i+1;stars>=1;stars--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
