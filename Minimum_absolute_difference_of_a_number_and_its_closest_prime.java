import java.util.*;
class file{
    public static int prime(int n){
        int i;
        if(n<2){
            return 0;
        }
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,a,b,t=0;
        n=sc.nextInt();
        a=n;
        b=n;
        while(1==1){
            if(prime(a)==1){
                System.out.println(t);
                break;
            }
            if(prime(b)==1){
                System.out.println(t);
                break;
            }
            t+=1;
            a-=1;
            b+=1;
        }
    }
}