import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            for(i=0;i<n/2;i++){
                System.out.print(arr[i]+" "+arr[n-(i+1)]+" ");
            }
        }
        else{
            for(i=0;i<n/2;i++){
                System.out.print(arr[i]+" "+arr[n-(i+1)]+" ");
            }
            System.out.print(arr[i]+" 0");
        }
    }
}
