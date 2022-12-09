import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,ans=0,a=0,b=1,c=0;
        n=sc.nextInt();
        while(1==1){
            c=a+b;
            if(c==n){
                a=1;
                break;
            }
            else if(c>n){
                break;
            }
            a=b;
            b=c;
        }
        if(a==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}