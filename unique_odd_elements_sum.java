import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,ans=0,b=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int x=arr[i];
            if(x%2!=0){
                int th=1;
                for(int k=0;k<b;k++){
                    if(brr[k]==x){
                        th=0;
                        break;
                    }
                }
                if(th==1){
                    brr[b]=x;
                    b+=1;
                    ans+=x;
                }
            }
        }
        System.out.println(ans);
    }
}
