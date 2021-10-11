package Arr;

import java.util.Scanner;

public class App9 {
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

    public static void matranvuongdgcheochinh(int[][] a) {
        int b;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    b = a[i][j];

                }
            }
        }
    }

    public static int duongcheophu(int[][] a) {
        int sum = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (j == dong - 1 - i) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static int duongcheochinh(int[][] a) {
        int tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    tong += a[i][j];
                }
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dong = scanner.nextInt();
        cot = scanner.nextInt();
        int[][] arr = new int[100][100];
        input(arr);
        output(arr);
//      int sum= duongcheochinh(arr);
//        System.out.println("Tổng đường chéo chính: "+sum);
//        int sum1=duongcheophu(arr);
//        System.out.println("Tổng đường chéo phụ"+sum1);
    }
}
