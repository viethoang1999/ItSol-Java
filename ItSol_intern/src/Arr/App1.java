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

    public static void sapxeptangdan(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void sapxepgiamdan(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void xuatHienMax(int[] arr,int[] arr1, int n) {
        int temp = 0;
        int count;
        int max = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            if (arr1[i]==0){
                arr1[i]=1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                        arr1[j]=1;
                    }
                }
                System.out.println(arr[i] + " " + count);
                if (max < count){
                    max = count;
                }
                if (max == count){
                    temp = arr[i];
                }
            }
        }
        System.out.println(temp);
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

    public static void sapXep(int[] arr, int n) {
        int temp;
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
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
        System.out.println("Đường chạy dài nhất có độ dài: "+max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                System.out.println("Tại vị trí "+i);
            }
        }
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
        sapxepgiamdan(arr,n);
        sapxeptangdan(arr,n);
//        checkDoiXung(arr, n);
       soNguyenToGanX(arr,n,x);
//        xuatHienMax(arr,arr1,n);

        duongChayDaiNhat(arr,n);


    }
}
