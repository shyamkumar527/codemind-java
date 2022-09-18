import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n,ans=0;
        n=sc.nextDouble();
        for(double i=1;i<=n;i++){
            ans+=(1/i);
        }
        System.out.printf("%.2f",ans);
    }
}