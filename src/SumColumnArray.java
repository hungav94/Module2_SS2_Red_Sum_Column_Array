import java.util.Scanner;

public class SumColumnArray {
    public static void inputArray(int[][] arr, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a element " + i + " " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void listArray(int[][] arr) {
        System.out.print("List Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap row: ");
        int row = sc.nextInt();
        System.out.print("Nhap col: ");
        int col = sc.nextInt();

        int[][] arr;
        arr = new int[row][col];
        inputArray(arr, row, col);

        System.out.print("Ban muon tinh tong cot thu: ");
        int indexCol = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == indexCol) {
                    sum += arr[i][indexCol];
                }
            }
        }
        listArray(arr);
        System.out.println("\nTong cua cot thu '" + indexCol + "' la: " + sum);
    }
}
