import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,sum=0,pro=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        if(sum==pro){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}