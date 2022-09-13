import java.util.*;
public class file{
    public static void main(String[] args){
        double p,t,r,a=0,c=0;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        a=Math.pow((1+r/100),t);
        c=p*a;
        System.out.printf("%.2f",c);
    }
}