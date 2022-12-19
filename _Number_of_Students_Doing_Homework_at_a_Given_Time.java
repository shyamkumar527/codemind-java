import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m,i,k,count=0;
        m=sc.nextInt();
        int arr[]=new int[m];
        for(i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++){
            if((arr[i]<=k && arr1[i]>=k)){
                count++;
            }
        }
        System.out.print(count);
    }
}