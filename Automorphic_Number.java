import java.util.*;
public class file{
    public static void main(String[] args){
        int n,sq=0,r,ans=0,a=1,m,dig=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        m=n;
        while(m!=0){
            dig+=1;
            m/=10;
        }
        while(dig!=0){
            r=sq%10;
            ans=ans+(a*r);
            sq/=10;
            a*=10;
            dig-=1;
        }
        if(ans==n){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}