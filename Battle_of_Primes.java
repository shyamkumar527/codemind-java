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
        int n1,n2,i,ans=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int c=n1+n2;
        for(i=c+1;i<10000;i++){
            if(prime(i)==1){
                ans=i;
                break;
            }
        }
        System.out.println(ans-c);
    }
}