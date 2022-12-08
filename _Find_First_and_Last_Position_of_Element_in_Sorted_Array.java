import java.util.*;
import java.lang.Math;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,t,f=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++){
            if(t==arr[i]){
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("-1 -1");
        }
        else{
            int i1=0,i2=0;
            for(i=0;i<n;i++){
                if(t==arr[i]){
                    i1=i;
                    break;
                }
            }
            for(i=n-1;i>-1;i--){
                if(t==arr[i]){
                    i2=i;
                    break;
                }
            }
            System.out.print(i1+" "+i2);
        }
    }
}