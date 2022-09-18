import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int l,r,ans=0;
            l=sc.nextInt();
            r=sc.nextInt();
            for(int j=l;j<=r;j++){
                int dig=j%10;
                if(dig==2 || dig==3 || dig==9){
                    ans+=1;
                }
            }
            System.out.println(ans);
        }
    }
}