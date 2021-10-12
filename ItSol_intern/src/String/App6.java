package String;

import java.util.Scanner;

public class App6 {

    public static void nhap(){
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        System.out.print("Nhâp chuỗi: "+s+"\n");
        System.out.print("Chuỗi sau khi sắp xếp: ");
        tach(s);
        System.out.print("");
    }
    public static void tach( String str){
        String[]s;
        s=str.split(" ");
        for (int i = 0; i < s.length-1 ; i++) {
            for (int j = i+1; j <s.length ; j++) {
                if (s[i].compareToIgnoreCase(s[j])>0){
                    String ss=s[i];
                    s[i]=s[j];
                    s[j]=ss;

                }
            }
            xuat(s);
        }
    }
    public static void  xuat(String[] s){
        for (String s1:s
             ) {
            System.out.print(s1+" ");
            
        }
    }

    public static void main(String[] args) {
        nhap();
    }
}
