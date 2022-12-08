import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int x,c=0,ans=0,j=0,r,k,val=100000;
            x=sc.nextInt();
            int arr[]=new int[10000];
            while(x!=0){
                r=x%10;
                arr[j++]=r;
                x=x/10;
                c+=1;
            }
            for(k=0;k<j;k++){
                if(arr[k]<val){
                    val=arr[k];
                }
            }
            for(int p=0;p<c-1;p++){
                val+=1;
                int nu=0;
                for(k=0;k<j;k++){
                    if(val==arr[k]){
                        nu+=1;
                    }
                }
                if(nu==0){
                    ans=1;
                    break;
                }
            }
            if(ans==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}