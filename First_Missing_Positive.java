import java.util.*;
import java.lang.Math;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,ans=1,k=0,one=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]==1){
                k=1;
                one=i;
                break;
            }
        }
        if(k==0){
            System.out.println("1");
        }
        else{
            int res=1,out=0;
            for(i=one;i<n;i++){
                if(arr[i]!=res){
                    System.out.println(res);
                    out=1;
                    break;
                }
                else{
                    res++;
                }
            }
            if(out==0){
                System.out.println(res);
            }
        }
    }
}