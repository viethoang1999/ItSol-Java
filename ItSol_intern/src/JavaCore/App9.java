package JavaCore;

public class App9 {
    public static boolean checkReversibleNumber(int n){
        String numberStr =String.valueOf(n);
        for (int i = 0; i <=numberStr.length()/2 ; i++) {
            if (numberStr.charAt(i)!=numberStr.charAt(numberStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void checkSixNumber(){
        System.out.println("Số có 7 đến 9 chữ số thuận nghịch là: ");
        for (int i=1000000;i<1000000000;i++){
            if (checkReversibleNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static void checkNumber(int n) {
        int temp;
        while (n>0){
            temp = n%10;
            if (temp !=0 && temp!=6 && temp!=8){
                System.out.println("Sai yêu cầu");
            }
            n /= 10;
        }
        System.out.println("Thỏa mãn yêu cầu");
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
    public static void tongChiaHetCho10(){
        for (int i = 1000000; i <100000000 ; i++) {
          if (sum(i)%10==0){
              System.out.println(i);
          }
        }
    }

    public static void main(String[] args) {
//        checkSixNumber();
//        checkNumber(686080);
        tongChiaHetCho10();
    }
}
