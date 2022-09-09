import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        double a=ab.nextDouble();
        double c=ab.nextDouble();
        double b=ab.nextDouble();
        double s=(a+b+c)/2;
        double ans=s*((s-a)*(s-b)*(s-c));
        double area=Math.sqrt(ans);
        System.out.printf("%.2f",area);
        ab.close();
    }
}