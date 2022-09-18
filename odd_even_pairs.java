import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,o=0,e=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int odd[]=new int[n];
        int even[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even[e]=arr[i];
                e+=1;
            }
            else{
                odd[o]=arr[i];
                o+=1;
            }
        }
        while(true){
            if(j==e && k==o){
                break;
            }
            else if(j==e){
                System.out.print(odd[k]+" ");
                k+=1;
            }
            else if(k==o){
                System.out.print(even[j]+" ");
                j+=1;
            }
            else{
                System.out.print(odd[k]+" ");
                k+=1;
                System.out.print(even[j]+" ");
                j+=1;
            }
        }
        if(n%2!=0){
            System.out.print("0");
        }
    }
}