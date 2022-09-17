import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                ans=0;
            }
        }
        if(ans==1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}