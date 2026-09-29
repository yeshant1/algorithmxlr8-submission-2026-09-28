import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        String[][] board = new String[8][8];

        // Write your solution here.
        // Print "White" or "Black".

        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                //r=0 c=0 black colour on real board
                board[r][c] = (r + c) % 2 == 0 ? "Black" : "White";
            }

        }
        int col = coordinates.charAt(0) - 'a'; //a to h becomes 0 to 7
        int row = coordinates.charAt(1) - '1'; // 1 to 8 becomes 0 to 7

        System.out.println(board[row][col]);

    }
}
