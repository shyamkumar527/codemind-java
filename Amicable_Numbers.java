import java.util.*;
public class file{
    public static void main(String[] args){
        int n,m,s1=0,s2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                s1+=i;
            }
        }
        for(int i=1;i<=m/2;i++){
            if(m%i==0){
                s2+=i;
            }
        }
        if(s1==m && s2==n){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}