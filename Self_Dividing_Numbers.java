import java.util.*;
public class file{
    public static void main(String[] args){
        int m,n,x,r;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++){
            int ans=1;
            x=i;
            while(x!=0){
                r=x%10;
                if(r==0 || i%r!=0){
                    ans=0;
                    break;
                }
                x/=10;
            }
            if(ans==1){
                System.out.print(i+" ");
            }
        }
    }
}