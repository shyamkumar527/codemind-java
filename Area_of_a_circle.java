import java.util.*;
public class file{
    public static void main(String[] srgs){
        int r;
        double area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.printf("%.2f",area);
        sc.close();
    }
}