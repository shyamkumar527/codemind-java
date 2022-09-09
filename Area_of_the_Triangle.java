import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        double a,b,c;
        double s,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
        sc.close();
    }
}