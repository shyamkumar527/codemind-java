import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,max=-100;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}