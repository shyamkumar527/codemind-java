import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print("-1 ");
            }
            else{
                int ans=100000,c=0;
                for(int j=i-1;j>=0;j--){
                    if(arr[j]<arr[i]){
                        ans=arr[j];
                        c=1;
                        break;
                    }
                }
                if(c==1){
                    System.out.print(ans+" ");
                }
                else{
                    System.out.print("-1 ");
                }
            }
        }
    }
}