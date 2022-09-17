import java.util.*;
public class file{
    public static void main(String[] args){
        int n,i,c=0;
        double avg=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg=avg/n;
        for(i=0;i<n;i++){
            if(arr[i]<=avg){
                c+=1;
            }
        }
        System.out.print(c);
    }
}