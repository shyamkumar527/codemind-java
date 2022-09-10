import java.util.*;
public class file{
    public static void main(String[] args){
        int n,ans=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                ans=0;
                break;
            }
        }
        if(ans==1){
            System.out.println("Ugly Number");
        }
        else{
            System.out.println("Not Ugly Number");
        }
    }
}