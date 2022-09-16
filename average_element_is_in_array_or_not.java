import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,avg=0,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg=avg/n;
        for(i=0;i<n;i++){
            if(arr[i]==avg){
                ans=1;
                break;
            }
        }
        if(ans==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}