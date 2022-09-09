import java.util.*;
public class file{
    public static void main(String[] srgs){
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*1.8);
        System.out.printf("%.2f",f);
        sc.close();
    }
}