import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập phần tử cần xoá:");
        int X = Integer.parseInt(scanner.nextLine());
        int delIndex = -1;
        boolean check = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                delIndex = i;
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = delIndex; i < N - 1; i++) {
                arr[i] = arr[i + 1];
            }
            N--;
            System.out.println("Phần tử " + X + " đã được xoá khỏi mảng.");
        } else {
            System.out.println("Phần tử " + X + " không có trong mảng.");
        }
        System.out.println("Mảng sau khi xoá:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
