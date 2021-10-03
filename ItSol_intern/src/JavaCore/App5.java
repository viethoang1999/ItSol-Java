package JavaCore;

import java.util.Scanner;

//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
public class App5 {
    public static int totalIntegers(int n) {
        int sum = 0;
        int soDu;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Tổng số nguyên " + n + " là: " + totalIntegers(n));
    }
}
