import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int val=1;
            for(j=0;j<n;j++){
                if(i!=j){
                    val*=arr[j];
                }
            }
            System.out.print(val+" ");
        }
    }
}