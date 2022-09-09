import java.util.*;
public class file{
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        double c1,c2;
        for(int i=0;i<t;i++){
            float x1,x2,y1,y2;
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            c1=y1/x1;
            c2=y2/x2;
            if(c1<c2){
                System.out.println("-1");
            }
            else if(c2<c1){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}