package Arr;

import java.util.Scanner;

public class App8 {
    public static void input(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
    }

    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + arr[i]);
        }
    }

    public static void duongChayDaiNhat(int[] arr, int n) {
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    b[i]++;
                }
                if (arr[j] > arr[j + 1]) {
                    break;
                }
            }
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("Đường chạy dài nhất có độ dài: " + max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                System.out.println("Tại vị trí " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        input(arr, n);
        output(arr, n);
        duongChayDaiNhat(arr, n);
    }
}
