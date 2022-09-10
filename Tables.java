import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i+=2){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}