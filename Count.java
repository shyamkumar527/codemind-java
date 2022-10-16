import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int even=0,odd=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println(even+" "+odd);
    }
}