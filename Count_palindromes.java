import java.util.*;
public class file{
    public static boolean palin(int n){
        int x=n,r=0,rev=0;
        while(x!=0){
            r=x%10;
            rev=rev*10+r;
            x/=10;
        }
        if(n==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            boolean res=palin(arr[i]);
            if(res){
                c+=1;
            }
        }
        System.out.println(c);
    }
}