import java.util.*;
class file{
    public static int prime(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,ans=0;
        n=sc.nextInt();
        for(i=2;i<n;i++){
            for(j=2;j<n;j++){
                if(i!=j && i*j==n){
                    if(prime(i)==1 && prime(j)==1){
                        ans=1;
                        System.out.println(i+" "+j);
                        break;
                    }
                }
            }
            if(ans==1){
                break;
            }
        }
        if(ans==0){
            System.out.println("-1");
        }
    }
}