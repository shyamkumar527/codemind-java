import java.util.*;
import java.lang.Math;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,ma=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int ne[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                c+=1;
            }
            else{
                if(c>ma){
                    ma=c;
                }
                c=0;
            }
        }
        if(c>ma){
            ma=c;
        }
        System.out.println(ma);
    }
}