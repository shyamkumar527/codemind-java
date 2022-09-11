import java.util.*;
public class file{
    public static void main(String[] args){
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}