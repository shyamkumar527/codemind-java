import java.util.*;
import java.lang.Math;
public class file{
    public static void main(String[] args){
        double a,b,c,pro=1,ans=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        pro=Math.pow(a,b);
        ans=pro%c;
        System.out.print((int)ans);
    }
}