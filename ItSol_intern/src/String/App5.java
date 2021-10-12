package String;

import java.util.Scanner;

public class App5 {
    public static void nhap(){
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        System.out.println("Chuỗi ban đầu: "+s);
        tach(s);
        System.out.println("");

    }
    public static void tach(String s){
        String[]ss;
        ss=s.split(" ");
        System.out.print("Chuỗi sau khi đảo: "+ss[ss.length-1]+" ");
        for (int i = 1; i <ss.length-1 ; i++) {
            System.out.print(ss[i]+" ");
            System.out.print(ss[0]);
        }

    }

    public static void main(String[] args) {
        nhap();
    }
} 
