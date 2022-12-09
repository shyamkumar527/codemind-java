import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++){
            int n,i,j;
            n=sc.nextInt();
            int arr[]=new int[n-1];
            for(i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            for(j=1;j<=n;j++){
                int c=0;
                for(int k=0;k<n-1;k++){
                    if(j==arr[k]){
                        c+=1;
                        break;
                    }
                }
                if(c==0){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}