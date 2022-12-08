import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,x,i,j;
        n=sc.nextInt();
        x=sc.nextInt();
        int arr[]=new int[n];
        int lis[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int ind=(i-x);
            if(ind<0){
                ind+=n;
            }
            lis[ind]=arr[i];
        }
        for(i=0;i<n;i++){
            System.out.print(lis[i]+" ");
        }
    }
}