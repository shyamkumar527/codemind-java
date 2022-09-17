import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,c=0,b=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        if(n%2!=0){
            System.out.print("0");
        }
    }
}
