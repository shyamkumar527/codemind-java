import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,a,b,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]<a || arr[i]>b){
                System.out.print(arr[i]+" ");
                ans=1;
            }
        }
        if(ans==0){
            System.out.print("-1");
        }
    }
}