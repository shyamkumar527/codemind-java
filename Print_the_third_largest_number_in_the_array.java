import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m1=-9999,m2=-9999,m3=-9999;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>m1){
                m1=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>m2 && arr[i]<m1){
                m2=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>m3 && arr[i]<m1 && arr[i]<m2){
                m3=arr[i];
            }
        }
        if(m3!=-9999){
            System.out.println(m3);
        }
        else{
            System.out.println("It is not possible");
        }
    }
}