import java.util.*;
class file{
    public static int palin(int n){
        int rev=0,r,x;
        x=n;
        while(x!=0){
            r=x%10;
            rev=(rev*10)+r;
            x/=10;
        }
        if(rev==n){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,d=1,a=0;
        n=sc.nextInt();
        while(1==1){
            if(palin(n-d)==1){
                a=1;
                System.out.print(n-d+" ");
            }
            if(palin(n+d)==1){
                a=1;
                System.out.println(n+d);
            }
            if(a==1){
                break;
            }
            else{
                d+=1;
            }
        }
    }
}