import java.util.*;
public class file{
    public static void main(String[] args){
        int n,m,sq=0,rev=0,r,revsq=0,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        sq=n*n;
        while(m!=0){
            r=m%10;
            rev=(rev*10)+r;
            m=m/10;
        }
        revsq=rev*rev;
        while(revsq!=0){
            r=revsq%10;
            ans=(ans*10)+r;
            revsq=revsq/10;
        }
        if(ans==sq){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}