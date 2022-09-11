import java.util.*;
public class file{
    public static void main(String[] args){
        int n,rev=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        System.out.println(rev);
    }
}