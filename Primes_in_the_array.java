import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,j,x,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            x=arr[i];
            if(x>=2){
                int t=1;
                for(j=2;j<=x/2;j++){
                    if(x%j==0){
                        t=0;
                        break;
                    }
                }
                if(t==1){
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}