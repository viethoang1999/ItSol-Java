package Arr;

import java.util.Scanner;

public class App6 {
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
    public static int[] them(int[] arr, int n, int x) {
        int index = n-1;
        int b[] = new int [n + 1];
        boolean check = false;
        for (int i = n; i>=0; i--){
            if (index > -1 && arr[index] >x ){
                b[i] = arr[index--];
            }else {
                if (!check){
                    b[i] = x;
                    check = true;
                }else {
                    b[i] = arr[index--];
                }
            }
        }
        return b;
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
        them(arr,n,x);
    }
}
