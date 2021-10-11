package Arr;

import java.util.Scanner;

public class App1 {

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

    public static void checkDoiXung(int[] arr, int n) {
        int check = 1;
        for (int i = 0; i < Math.sqrt(n); i++) {
            if (arr[i] != arr[n - i - 1]) {
                check = 0;
                break;
            }
        }
        if (check == 0) {
            System.out.println("no");
        } else {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        input(arr, n);
        output(arr, n);
        checkDoiXung(arr, n);

    }
}
