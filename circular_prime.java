import java.util.*;
public class file{
    public static void main(String[] args){
        int n,p=1,cp=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                p=0;
                break;
            }
        }
        if(p==1){
            int rev=0,r;
            while(n!=0){
                r=n%10;
                rev=(rev*10)+r;
                n/=10;
            }
            for(int i=2;i<=rev/2;i++){
                if(rev%i==0){
                    cp=0;
                    break;
                }
            }
            if(cp==1){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
    }
}