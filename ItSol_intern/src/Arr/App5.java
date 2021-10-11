package Arr;

import java.util.Scanner;

public class App5 {

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

    public static boolean checkPrimeNumber(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void soNguyenToGanX(int[] a, int n, int x) {
        int primeNumber = 0;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (checkPrimeNumber(a[i]) && Math.abs(a[i] - x) < distance) {
                distance = Math.abs(a[i] - x);
                primeNumber = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (primeNumber == a[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        input(arr, n);
        output(arr, n);
        soNguyenToGanX(arr, n, x);
    }
}
