package Arr;

import java.util.Scanner;

public class App4 {
    public static void input(int[][] arr, int a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử thú " + (i + 1) + " : ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void output(int[][] arr, int a, int n) {
        System.out.println("Mảng được nhập: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    private static void chuyenMang(int[][] arr, int a, int n, int[] c) {
        int[] b = new int[a * n];
        int x = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                b[x++] = arr[i][j];
            }
        }
        System.out.println("Mảng sau khi chuyển đổi: ");
        for (int m = 0; m < x; m++) {
            System.out.print(b[m] + " ");
            c[m] = 0;
        }
        System.out.println("\n");
        int count;
        for (int i = 0; i < a * n; i++) {
            count = 1;
            if (c[i] == 0) {
                c[i] = 1;
                for (int j = i + 1; j < a * n; j++) {
                    if (b[j] == b[i]) {
                        count++;
                        c[j] = 1;
                    }
                }
                System.out.println(b[i] + " " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();
        int[][] arr = new int[n][x];
        int[] arr1 = new int[n * x];
        input(arr, n, x);
        output(arr, n, x);
        chuyenMang(arr,n,x,arr1);

    }
}
