import java.util.*;
import java.lang.Math;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    ans=1;
                    break;
                }
            }
            if(ans==1){
                break;
            }
        }
    }
}