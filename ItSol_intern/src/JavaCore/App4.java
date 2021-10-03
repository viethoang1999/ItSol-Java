package JavaCore;

//Viết chương trình in ra các cặp số nguyên tố cùng nhau trong đoạn [a,b] với a,b
//nhập từ bàn phím.
public class App4 {
    public static boolean Prime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (i < 2) {
                return false;
            }
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void paragraph(int a, int b){
        for (int i=a;i<=b;i++){
            if (Prime(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
     paragraph(2,10);
    }
}
