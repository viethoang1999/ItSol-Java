package Arr;

import java.util.Scanner;

public class App2 {
    public static void input(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
    }

    public static void output(int[] arr,int number, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int[]a = new int[n];
        int[]b = new int[m];
        input(a,n);
        input(b,m);
        if (p>=0 && p<=n){
            output(a,0,p);
            output(b,0,m);
            output(a,p,n);
        }
    }
}
