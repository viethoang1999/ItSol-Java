package JavaCore;

public class App10 {
    public static boolean checkPrimeNumber(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void sNt(){
        for (int i=1000000;i<10000000;i++){
            if(checkPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean check(int n) {
        int number;
        while(n>0){
            number = n%10;
            if(!checkPrimeNumber(number)){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void kTr(){
        for (int i = 1000000; i <10000000 ; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isReversible(int n) {
        int number = 0;
        int m = n;
        while(m >0){
            number = number * 10 + m % 10;
            m /= 10;
        }
        return checkPrimeNumber(number);
    }

    public static void daoSo(){
        for (int i = 1000000; i <10000000 ; i++) {
            if(isReversible(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
//        sNt();
//        kTr();
        daoSo();
    }
    }

