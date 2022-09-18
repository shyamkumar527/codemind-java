import java.util.*;
public class file{
    public static void main(String[] args){
        int n,a,b,i,max=-100,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                ans+=arr[i];
            }
        }
        System.out.println(ans);
    }
}
