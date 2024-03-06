import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng :");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("1.Nhập giá trị [%d][%d] = ",i,j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        do {
            System.out.println("********Mời ban chon thao tac********\n"+
                        "1.In các phần tử của mảng dưới dạng ma trận\n"+
                        "2.Tính tổng tất cả phần tử mảng \n"+
                        "3.In ra đường chéo chính  \n"+
                        "4.In ra đường chéo phụ (phải là ma trận vuông) \n"+
                        "5.In ra đường viền \n"+
                        "6.Thoát");
            System.out.println("Mời bạn chọn từ 1-6");
            int choice = Integer.parseInt((scanner.nextLine()));

            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum += arr[i][j];
                        }
                    }
                    System.out.println(sum);
                    break;
                case 3: // Đường chéo chính
                        System.out.println("Đường chéo chính:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (i == j) {
                                System.out.printf("%-3d", arr[i][j]);
                            } else {
                                System.out.printf("%-3s", "");
                            }
                        }
                    }
                    break;

                case 4:
                    if (rows == cols) {
                        System.out.println("Đường chéo phụ:");
                        for (int i = 0; i < rows; i++) {
                            System.out.print(arr[i][cols - 1 - i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Ma trận không phải là ma trận vuông!");
                    }
                    break;
                default:
                    System.out.println("Nhap sai yeu cau");

            }
        } while (true);
    }
}
