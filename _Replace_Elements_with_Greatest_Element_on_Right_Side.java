import java.util.*;
import java.lang.Math;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,ans=1,k=0,one=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int ne[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(i==n-1){
                ne[i]=-1;
            }
            else{
                int ma=0;
                for(j=i+1;j<n;j++){
                    if(arr[j]>ma){
                        ma=arr[j];
                    }
                }
                ne[i]=ma;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(ne[i]+" ");
        }
    }
}