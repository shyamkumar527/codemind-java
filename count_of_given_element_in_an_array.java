import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==k){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}