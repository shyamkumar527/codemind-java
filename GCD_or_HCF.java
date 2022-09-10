import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=0;
        while(b!=0){
            g=b;
            b=a%b;
            a=g;
        }
        System.out.println(a);
    }
}