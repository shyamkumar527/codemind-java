import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            ans=(ans*10)+r;
            n=n/10;
        }
        System.out.println(ans);
    }
}