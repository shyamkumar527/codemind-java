import java.util.*;
public class file{
    public static void main(String[] args){
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=c*(1.8)+32;
        System.out.printf("%.2f",f);
    }
}