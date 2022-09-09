import java.util.*;
public class file{
    public static void main(String[] args){
        int t,s,b;
        long ans;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        ans=2*t*s*b*512;
        System.out.println(ans);
    }
}