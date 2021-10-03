package JavaCore;

//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
public class App6 {
    public static boolean Prime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void analysis(int n) {
        for (int i = 2; i <= n; i++) {
            while (Prime(i) && n % i == 0) {
                System.out.print(" " + i);
                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        analysis(18);
    }
}
