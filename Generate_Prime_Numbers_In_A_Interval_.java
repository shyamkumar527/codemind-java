import java.util.*;
public class file{
    public static void main(String[] args){
        int a,b,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++){
            int t=1;
            if(i>=2){
                for(j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        t=0;
                        break;
                    }
                }
                if(t==1){
                    System.out.println(i);
                }
            }
        }
    }
}