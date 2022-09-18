import java.util.*;
public class file{
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n,i,min=1000,max=-1000,c=0,mini=0,maxi=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                maxi=i;
            }
            if(arr[i]<min){
                min=arr[i];
                mini=i;
            }
        }
        if(mini<maxi){
            for(i=mini;i<=maxi;i++){
                boolean res=prime(arr[i]);
                if(res){
                    c+=1;
                }
            }
        }
        else{
            for(i=maxi;i<=mini;i++){
                boolean res=prime(arr[i]);
                if(res){
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}