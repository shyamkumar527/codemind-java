import java.util.*;
public class file{
    public static void main(String[] args){
        int n,r,dig=0,ans=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[100];
        while(n!=0){
            r=n%10;
            arr[dig]=r;
            dig+=1;
            n/=10;
        }
        for(int i=0;i<dig;i++){
            for(int j=0;j<dig;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        ans=0;
                        break;
                    }
                }
            }
            if(ans==0){
                break;
            }
        }
        if(ans==1){
            System.out.println("Unique Number");
        }
        else{
            System.out.println("Not Unique Number");
        }
    }
}