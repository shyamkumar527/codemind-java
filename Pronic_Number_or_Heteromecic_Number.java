import java.util.*;
public class file{
    public static void main(String[] args){
        int n,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n/2;i++){
            if(i*(i+1)==n){
                ans=1;
                break;
            }
        }
        if(ans==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}