import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}