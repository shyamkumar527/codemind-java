import java.util.*;
public class file{
    public static void main(String[] args){
        int n,x,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            x=sc.nextInt();
            int fact=1;
            for(int j=1;j<=x;j++){
                fact*=j;
            }
            System.out.println(fact);
        }
    }
}