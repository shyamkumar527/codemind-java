import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,c=0,ans=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int ne[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int x=arr[i],t=0;
            for(j=0;j<c;j++){
                if(x==ne[j]){
                    t=1;
                    break;
                }
            }
            if(t==0){
                int count=0;
                ne[c++]=x;
                for(k=0;k<n;k++){
                    if(x==arr[k]){
                        count+=1;
                    }
                }
                ans+=count/2;
            }
        }
        System.out.println(ans);
    }
}