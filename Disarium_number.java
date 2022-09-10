import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,m,ans=0,c=0,num=0,fin=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(m!=0){
            c+=1;
            r=m%10;
            m=m/10;
        }
        m=n;
        while(m!=0){
            r=m%10;
            fin+=Math.pow(r,c);
            m=m/10;
            c--;
        }
        if(fin==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}