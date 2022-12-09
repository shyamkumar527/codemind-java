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
        int k;
        k=sc.nextInt();
        for(int i=0;i<k;i++){
            int n,x,y;
            n=sc.nextInt();
            x=n;
            y=n;
            while(1==1){
                if(prime(x)==1){
                    System.out.println(x);
                    break;
                }
                if(prime(y)==1){
                    System.out.println(y);
                    break;
                }
                x-=1;
                y+=1;
            }
        }
    }
}