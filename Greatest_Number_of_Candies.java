import java.util.*;
public class file{
    public static void main(String[] args){
        int n,max=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]+k>=max){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}