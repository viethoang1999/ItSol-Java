package JavaCore;

//Viết chương trình liệt kê các số nguyên tố có 6 chữ số chỉ bao gồm các chữ số lẻ.
public class App7 {

    public static boolean Prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               return false;
            }
        }
        return true;
    }
    public static void SNt(){
        System.out.println("Liệt kê tất cả số nguyên tố có 6 chữ số:");
        for (int i = 100001; i < 999999; i+=2) {
            if (Prime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
     SNt();
    }
}
