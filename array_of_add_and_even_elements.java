import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,o=0,e=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int odd[]=new int[100];
        int even[]=new int[100];
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
        for(i=0;i<o;i++){
            System.out.print(odd[i]+" ");
        }
        for(i=0;i<e;i++){
            System.out.print(even[i]+" ");
        }
    }
}