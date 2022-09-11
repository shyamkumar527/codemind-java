import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,sum=0,sq;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0){
            r=sq%10;
            sum+=r;
            sq/=10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}