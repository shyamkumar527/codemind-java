import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print(j+"");
            }
            a--;
            System.out.println();
        }
    }
}