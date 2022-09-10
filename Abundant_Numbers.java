import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                ans+=i;
            }
        }
        if(ans>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}