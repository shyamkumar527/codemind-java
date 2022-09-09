import java.util.*;
public class file{
    public static void main(String[] args){
        double n,m;
        double ans;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        ans=(n+m)/2;
        System.out.printf("%.4f",ans);
        sc.close();
    }
}