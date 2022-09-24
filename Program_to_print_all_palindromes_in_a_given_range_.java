import java.util.*;
public class file{
    public static boolean palin(int n){
        int r1=0,r2=0,ans=1;
        int dig=(int)Math.log10(n);
        while(n!=0){
            r1=n/(int)Math.pow(10,dig);
            r2=n%10;
            if(r1!=r2){
                ans=0;
                break;
            }
            n=n%(int)Math.pow(10,dig);
            n=n/(int)Math.pow(10,dig);
            dig-=2;
        }
        if(ans==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b;i++){
            boolean res=palin(i);
            if(res){
                System.out.print(i+" ");
            }
        }
    }
}