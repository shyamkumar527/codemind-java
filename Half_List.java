import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=0,y=0,k=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n/2];
        int b[]=new int[n/2];
        int c[]=new int[n/2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i<n/2){
                a[x++]=arr[i];
            }
            else{
                b[y++]=arr[i];
            }
        }
        for(int i=y-1;i>=0;i--){
            c[k++]=b[i];
        }
        for(int i=0;i<y;i++){
            System.out.print(c[i]+" ");
        }
        for(int i=0;i<x;i++){
            System.out.print(a[i]+" ");
        }
    }
}