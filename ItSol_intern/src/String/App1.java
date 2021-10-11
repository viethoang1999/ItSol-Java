package String;

public class App1 {


    public static boolean thuanNghich(String s) {
        for (int i = 0; i < s.length(); i++) {
if (s.charAt(i)!=s.charAt(s.length()-1-i)){
    return false;
}
        }
        return true;
    }
    public static void check(){
        int count=0;
        for (int i = 100000; i <=999999 ; i++) {
            String s="";
            s+=i;
            if (thuanNghich(s)){
                System.out.println(i);
                if (count++ %10==0){
                    System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        check();
    }
}
