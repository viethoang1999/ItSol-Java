package JavaCore;
//Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
public class app2 {
    public static void divisor(int n){
      int count=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println("Các ước số của "+n+" là: "+i);
                count++;
            }
        }
        System.out.println("Có "+count+" ước số của "+n);

    }

    public static void main(String[] args) {
        divisor(50);
    }
}
