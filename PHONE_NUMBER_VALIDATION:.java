import java.util.*;
public class file{
    public static void main(String[] args){
        long n,c=0,r=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        while(n!=0){
            r=n%10;
            c+=1;
            n=n/10;
        }
        if(c==10){
            if(r==0){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Valid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}