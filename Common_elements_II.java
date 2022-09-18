import java.util.*;
public class file{
    public static void main(String[] args){
        int m,n,i,c=0,r=0,a=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[]=new int[m];
        int brr[]=new int[n];
        int res[]=new int[100];
        int fin[]=new int[100];
        for(i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        for(i=0;i<m;i++){
            int ans=0;
            for(int j=0;j<r;j++){
                if(arr[i]==res[j]){
                    ans=1;
                    break;
                }
            }
            if(ans==0){
                res[r]=arr[i];
                r+=1;
                int pre=0;
                for(int k=0;k<n;k++){
                    if(arr[i]==brr[k]){
                        pre=1;
                        break;
                    }
                }
                if(pre==0){
                    fin[a]=arr[i];
                    a+=1;
                }
            }
        }
        for(i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<r;j++){
                if(brr[i]==res[j]){
                    ans=1;
                    break;
                }
            }
            if(ans==0){
                res[r]=brr[i];
                r+=1;
                int pre=0;
                for(int k=0;k<m;k++){
                    if(brr[i]==arr[k]){
                        pre=1;
                        break;
                    }
                }
                if(pre==0){
                    fin[a]=brr[i];
                    a+=1;
                }
            }
        }
        for(i=0;i<a;i++){
            System.out.print(fin[i]+" ");
        }
    }
}