import java.util.*;
public class file{
    public static void main(String[] args){
        int n,ans=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                ans=0;
                break;
            }
        }
        if(ans==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}