import java.util.*;
public class file{
    public static void main(String[] args){
        int n,x,y,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int rev=0;
            x=sc.nextInt();
            y=x;
            while(y!=0){
                r=y%10;
                rev=(rev*10)+r;
                y/=10;
            }
            if(rev==x){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}