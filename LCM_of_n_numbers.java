import java.util.*;
public class file{
    public static void main(String[] args){
        int n,max=0,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        while(true){
            int c=0;
            for(int i=0;i<n;i++){
                if(max%arr[i]==0){
                    c+=1;
                }
            }
            if(c==n){
                ans=max;
                break;
            }
            else{
                max++;
            }
        }
        System.out.println(ans);
    }
}