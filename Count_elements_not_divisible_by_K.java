import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,k,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]%k!=0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}