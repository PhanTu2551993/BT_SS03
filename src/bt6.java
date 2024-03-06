import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int col = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng các số ở cột " + col + " là: " + sum);
    }
}
