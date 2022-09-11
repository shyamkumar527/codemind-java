import java.util.*;
import java.lang.Math;
public class file{
    public static void main(String[] args){
        int a,b,c,ans=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%c==0){
                ans+=1;
            }
        }
        System.out.print(ans);
    }
}