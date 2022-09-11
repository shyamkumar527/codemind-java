import java.util.*;
public class file{
    public static void main(String[] args){
        int n,x,r,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=n;
        while(x!=0){
            int fact=1;
            r=x%10;
            for(int i=r;i>=1;i--){
                fact*=i;
            }
            ans+=fact;
            x/=10;
        }
        if(ans==n){
            System.out.println("The number "+n+" is a strong number");
        }
        else{
            System.out.println("The number "+n+" is not a strong number");
        }
    }
}