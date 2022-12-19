import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,k=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[1000];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i+=2){
            int t=arr[i];
            for(j=0;j<t;j++){
                brr[k++]=arr[i+1];
            }
        }
        for(i=0;i<k;i++){
            System.out.print(brr[i]+" ");
        }
    }
}