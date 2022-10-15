import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,ze=0,on=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                ze++;
            }
            else{
                on++;
            }
        }
        for(int i=0;i<ze;i++){
            System.out.print("0 ");
        }
        for(int i=0;i<on;i++){
            System.out.print("1 ");
        }
    }
}