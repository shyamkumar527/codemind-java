import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,r=0,f,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f=sc.nextInt();
        for(i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<r;j++){
                if(arr[i]==res[j]){
                    ans=1;
                    break;
                }
            }
            if(ans==0){
                res[r]=arr[i];
                r++;
                int times=0;
                for(int k=0;k<n;k++){
                    if(arr[i]==arr[k]){
                        times+=1;
                    }
                }
                if(times==f){
                    System.out.print(arr[i]+" ");
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.print("-1");
        }
    }
}