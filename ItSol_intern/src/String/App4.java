package String;

import java.util.Scanner;

public class App4 {

    public static void nhap(){
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        System.out.println("Chuoi: "+s);
        timMax(s);
    }

    public static void timMax(String s){
        int [] len;
        String[] ss;
        ss=s.split(" ");
        len=new int[ss.length];
        int max=0;
        for (int i = 0; i <ss.length ; i++) {
            int l=ss[i].length();
            len[i]=l;
            if(l>max){
                max=l;
            }

                
            }
        int count=0;
        for (int i = 0; i <ss.length ; i++) {
          if (len[i]==max){
              System.out.println(ss[i]);
              System.out.println(", vi tri "+count);
          }
          count+= len[i]+1;
        }
    }

    public static void main(String[] args) {
nhap();
    }
}
