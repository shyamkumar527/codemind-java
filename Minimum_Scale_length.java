import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int min=10000,ans=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
        }
        while(ans==0){
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]%min==0){
                    count+=1;
                }
            }
            if(count==n){
                ans=1;
            }
            else{
                min--;
            }
        }
        System.out.println(min);
    }
}