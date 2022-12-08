import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[i]){
                    c+=1;
                }
            }
            System.out.print(c+" ");
        }
    }
}