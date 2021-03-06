package Arr;

import java.util.Scanner;

public class App3 {

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

    private static void xuatHienMax(int[] arr, int[] arr1, int n) {
        int temp = 0;
        int count;
        int max = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            if (arr1[i] == 0) {
                arr1[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                        arr1[j] = 1;
                    }
                }
                System.out.println(arr[i] + " " + count);
                if (max < count) {
                    max = count;
                }
                if (max == count) {
                    temp = arr[i];
                }
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int x=scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        int [] arr1=new int[n];
        input(arr, n);
        output(arr, n);
        xuatHienMax(arr,arr1,n);
    }
}
