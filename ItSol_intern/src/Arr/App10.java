package Arr;

import java.util.Scanner;

public class App10 {
    private static int dong;
    private static int cot;

    public static void input(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("a[" + i + "][" + j + "]= ");
                a[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void output(int[][] a) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

    private static void xoayMT(int[][] a) {
        for (int i = dong - 1; i >= 0; i--) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dong = scanner.nextInt();
        cot = scanner.nextInt();
        int[][] arr = new int[100][100];
        input(arr);
        output(arr);
        xoayMT(arr);
    }
}
