import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++){
            int n,j;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            if(n==1){
                System.out.println("1");
            }
            else{
                int a=1;
                for(j=1;j<n;j++){
                    if(arr[j-1]>arr[j]){
                        a+=1;
                    }
                }
                System.out.println(a);
            }
        }
    }
}