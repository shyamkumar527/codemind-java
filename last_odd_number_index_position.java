import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}