package String;

import java.util.Scanner;

public class App3 {

    public static void chuanHoa(String s){
        s=s.toLowerCase();
        String s2="";
        String [] ss;
        ss=s.split(" ");
        for (int i = 0; i <ss.length ; i++) {
            String s1="";
            if (ss[i].length()!=0){
                s1+=Character.toUpperCase(ss[i].charAt(0));
               if(ss[i].length()>1){
                   s1+=ss[i].substring(1);
                   s2+=s1;
                   if (i<ss.length){
                       s2+=" ";
                   }

               }
            if (s2.charAt(s2.length()-1)==' '){
                s2+="\b";
                System.out.println("String sau khi chuan hoa: "+s2);
            }
            }
        }
    }
    public static void nhap(){
        String string;
        Scanner scanner=new Scanner(System.in);
        string=scanner.nextLine();
        System.out.println("String trk khi chuan hoa: "+string);
        chuanHoa(string);
    }

    public static void main(String[] args) {
nhap();
    }
}
