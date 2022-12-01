import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,a=0,b=1;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}