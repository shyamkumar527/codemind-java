import java.util.*;
class file{
    public static void main(String[] args){
        int n,r,m=0,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=n;
        while(x!=0){
            r=x%10;
            m=(m*10)+r;
            x=x/10;
        }
        if(m==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}