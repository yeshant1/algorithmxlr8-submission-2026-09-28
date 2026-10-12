import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        // Write your solution here.
        // Print the single-digit result of repeatedly summing num's digits.
       while(num > 9){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i =0;i<str.length();i++){
           sum = sum + Character.getNumericValue(str.charAt(i));
        }

        num = sum;
       }

        if(num >=0 && num <= 9 ){
            System.out.println(num);
        }
    }
}
