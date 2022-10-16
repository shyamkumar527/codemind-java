import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int res=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            while(true){
                for(int j=1;j<=arr[i];j++){
                    if(j*j==arr[i]){
                        res+=arr[i];
                        break;
                    }
                    if(j*j>arr[i]){
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(res);
    }
}