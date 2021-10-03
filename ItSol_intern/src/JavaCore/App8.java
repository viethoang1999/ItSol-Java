package JavaCore;
//Viết chương trình liệt kê tất cả các số thuận nghịch có sáu chữ số (số thuận nghịch
//là số đối xứng nhau,
public class App8 {
    public static boolean checkReversibleNumber(int n) {
        String numberStr = String.valueOf(n);
        for (int i = 0; i <= numberStr.length() / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(numberStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void checkSixNumber() {
        System.out.println("Số có 6 chữ số thuận nghịch là: ");
        for (int i = 100000; i < 1000000; i++) {
            if (checkReversibleNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int n) {
        int  balance;
        int sum = 0;
        while (n> 0) {
            balance = n % 10;
            sum += balance;
            n /= 10;
        }

        return sum;
    }



    public static void main(String[] args) {
//        checkSixNumber();
        for (int i = 100000; i <1000000 ; i++) {
            if (checkReversibleNumber(i)&&sum(i)%10==0){
                System.out.println(i);
            }
        }
    }
}
