import java.util.*;
public class file{
    public static void main(String[] args){
        int n,min=100,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
        }
        while(true){
            int c=0;
            for(int i=0;i<n;i++){
                if(arr[i]%min==0){
                    c+=1;
                }
            }
            if(c==n){
                ans=min;
                break;
            }
            else{
                min--;
            }
        }
        System.out.println(ans);
    }
}