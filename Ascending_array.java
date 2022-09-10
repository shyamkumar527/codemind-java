import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int [n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            if(arr[i+1]<=arr[i]){
                ans=0;
                break;
            }
        }
        if(ans==0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}