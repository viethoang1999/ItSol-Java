package JavaCore;

import java.util.Scanner;

public class app1 {

    public static int sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sum1(int n) {
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        return sum1;
    }

    public static float sum2(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n= scanner.nextInt();
        int sum1 = sum(6);
        int sum2 = sum1(5);
        float sum3 = sum2(5);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}

