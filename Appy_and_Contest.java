import java.util.*;
public class file{
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a,b;
            long k,n,ans=0;
            n=sc.nextLong();
            a=sc.nextInt();
            b=sc.nextInt();
            k=sc.nextLong();
            for(int j=1;j<=n;j++){
                if(j%a==0 && j%b!=0){
                    ans+=1;
                    if(ans>=k){
                        break;
                    }
                }
                else if(j%b==0 && j%a!=0){
                    ans+=1;
                    if(ans>=k){
                        break;
                    }
                }
            }
            if(ans>=k){
                System.out.println("Win");
            }
            else{
                System.out.println("Lose");
            }
        }
    }
}