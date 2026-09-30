import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        char[] chars = num.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]== '6'){
                chars[i] = '9';
                break;
            }
        }
        String res = new String(chars);
        System.out.println(res);
    }
}
