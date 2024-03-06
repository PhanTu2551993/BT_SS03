import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập vị trí cần thêm:");
        int X = Integer.parseInt(scanner.nextLine());
        if (X < 0 || X > N) {
            System.out.println("Vị trí không hợp lệ.");
        } else {
            N++;
            int[] newArr = new int[N];
            for (int i = 0; i < X; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("Nhập giá trị cần thêm:");
            int newValue = Integer.parseInt(scanner.nextLine());
            newArr[X] = newValue;
            for (int i = X + 1; i < N; i++) {
                newArr[i] = arr[i - 1];
            }
            arr = newArr;
            System.out.println("Phần tử đã được thêm vào vị trí " + X);
        }
        System.out.println("Mảng sau khi thêm:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
