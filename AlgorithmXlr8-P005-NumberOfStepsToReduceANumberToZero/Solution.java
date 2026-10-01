import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Write your solution here.
        // Print the number of steps to reduce num to zero.
        int count = 0;

        // if(num == 0) return 0;
        // else if(num % 2 ==0) {
        //     num = num / 2;
        //     count++;
        // }else if(num % 2 != 0){
        //     num = num - 1;
        //     count++;
        // }

     while(num != 0){
        if(num % 2 ==0) {
            num = num / 2;
            count++;
        }else {
            num = num - 1;
            count++;
        }
    
    }

       System.out.println(count);
    }

}
