import java.util.*;
public class file{
    public static void main(String[] args){
        int n,a=0,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=1;i<n-1;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}